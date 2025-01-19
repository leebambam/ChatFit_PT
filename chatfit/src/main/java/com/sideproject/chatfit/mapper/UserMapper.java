package com.sideproject.chatfit.mapper;

import com.sideproject.chatfit.dto.UserDto;
import com.sideproject.chatfit.entity.ChatUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    // 엔티티 → DTO
    @Mapping(source = "user_idx", target = "userIdx")
    @Mapping(source = "user_id", target = "userId")
    @Mapping(source = "user_name", target = "userName")
    @Mapping(source = "user_nickname", target = "userNickname")
    @Mapping(source = "user_email", target = "userEmail")
    @Mapping(source = "user_age", target = "userAge")
    @Mapping(source = "user_gender", target = "userGender")
    @Mapping(source = "user_weight", target = "userWeight")
    @Mapping(source = "user_height", target = "userHeight")
    @Mapping(source = "user_fitness_level", target = "userFitnessLevel")
    @Mapping(source = "user_fitness_goal", target = "userFitnessGoal")
    @Mapping(source = "user_address", target = "userAddress")
    @Mapping(source = "user_created_at", target = "userCreatedAt")
    @Mapping(source = "user_updated_at", target = "userUpdatedAt")
    @Mapping(source = "user_status", target = "userStatus")
    @Mapping(source = "user_photo", target = "userPhoto")
    UserDto toDto(ChatUser user);

    // DTO → 엔티티
    @Mapping(source = "userIdx", target = "user_idx")
    @Mapping(source = "userId", target = "user_id")
    @Mapping(source = "userName", target = "user_name")
    @Mapping(source = "userNickname", target = "user_nickname")
    @Mapping(source = "userEmail", target = "user_email")
    @Mapping(source = "userAge", target = "user_age")
    @Mapping(source = "userGender", target = "user_gender")
    @Mapping(source = "userWeight", target = "user_weight")
    @Mapping(source = "userHeight", target = "user_height")
    @Mapping(source = "userFitnessLevel", target = "user_fitness_level")
    @Mapping(source = "userFitnessGoal", target = "user_fitness_goal")
    @Mapping(source = "userAddress", target = "user_address")
    @Mapping(source = "userCreatedAt", target = "user_created_at")
    @Mapping(source = "userUpdatedAt", target = "user_updated_at")
    @Mapping(source = "userStatus", target = "user_status")
    @Mapping(source = "userPhoto", target = "user_photo")
    ChatUser toEntity(UserDto userDto);
}
