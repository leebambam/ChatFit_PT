package com.sideproject.chatfit.service;


import com.sideproject.chatfit.dto.UserDto;
import com.sideproject.chatfit.entity.ChatUser;
import com.sideproject.chatfit.mapper.UserMapper;
import com.sideproject.chatfit.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final 필드 또는 @NonNull이 붙은 필드만을 대상으로 한 생성자를 자동으로 생성
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserDto create(UserDto userDto){
        // DTO를 엔티티로 변환
        ChatUser chatUser = UserMapper.INSTANCE.toEntity(userDto);
        // DB에 저장
        ChatUser savedUser = userRepository.save(chatUser);

        // 저장된 엔티티를 다시 DTO로 변환하여 반환
        return UserMapper.INSTANCE.toDto(savedUser);
    }




}
