package com.sideproject.chatfit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer userIdx;           // user_idx
    private String userId;             // user_id
    private String userName;           // user_name
    private String userNickname;       // user_nickname
    private String userEmail;          // user_email
    private Integer userAge;           // user_age
    private String userGender;         // user_gender
    private Float userWeight;          // user_weight
    private Float userHeight;          // user_height
    private String userFitnessLevel;   // user_fitness_level
    private String userFitnessGoal;    // user_fitness_goal
    private String userAddress;        // user_address
    private LocalDateTime userCreatedAt; // user_created_at
    private LocalDateTime userUpdatedAt; // user_updated_at
    private Integer userStatus;        // user_status
    private String userPhoto;          // user_photo
}
