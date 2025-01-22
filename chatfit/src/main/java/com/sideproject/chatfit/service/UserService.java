package com.sideproject.chatfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sideproject.chatfit.repository.UserRepository;
import com.sideproject.chatfit.vo.user.UserVO;

@Service
public class UserService {
	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserVO> getAllUsers() {
        return userRepository.findAll();
    }

    public UserVO getUserById(int user_num) {
        return userRepository.findById(user_num).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public UserVO createUser(UserVO user) {
        return userRepository.save(user);
    }

    public UserVO updateUser(int user_num, UserVO userVO) {
        UserVO user = getUserById(user_num);
        user.setUser_email(userVO.getUser_email());
        user.setUser_nickname(userVO.getUser_nickname());
        user.setUser_age(userVO.getUser_age());
        user.setUser_address1(userVO.getUser_address1());
        user.setUser_address2(userVO.getUser_address2());
        user.setZipcode(userVO.getZipcode());
        user.setUser_weight(userVO.getUser_weight());
        user.setUser_height(userVO.getUser_height());
        user.setUser_mdate(userVO.getUser_mdate());
        
        return userRepository.save(user);
    }

    public void deleteUser(int user_num) {
        userRepository.deleteById(user_num);
    }

}
