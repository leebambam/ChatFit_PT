package com.sideproject.chatfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sideproject.chatfit.repository.UserRepository;
import com.sideproject.chatfit.vo.User;

@Service
public class UserService {
	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByUserNum(int userNum) {
        return userRepository.findById(userNum).orElseThrow(() -> new RuntimeException("User not found"));
    }
    
    public User getUserByUserId(String userId) {
        return userRepository.findByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + userId));
    }
    
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int userNum, User userVO) {
        User user = getUserByUserNum(userNum);
        user.setUserEmail(userVO.getUserEmail());
        user.setUserNickname(userVO.getUserNickname());
        user.setUserAge(userVO.getUserAge());
        user.setUserAddress1(userVO.getUserAddress1());
        user.setUserAddress2(userVO.getUserAddress2());
        user.setUserZipcode(userVO.getUserZipcode());
        user.setUserWeight(userVO.getUserWeight());
        user.setUserHeight(userVO.getUserHeight());
        user.setUserMdate(userVO.getUserMdate());
        
        return userRepository.save(user);
    }

    public void deleteUser(int userNum) {
        userRepository.deleteById(userNum);
    }

}
