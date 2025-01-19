package com.sideproject.chatfit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChatUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_idx;

    @Column(length = 60, unique = true)
    private String user_id;

    @Column(length = 24)
    private String user_name;

    @Column(length = 36, unique = true)
    private String user_nickname;

    @Column(length = 255, unique = true)
    private String user_email;

    @Column(length = 3)
    private Integer user_age;

    @Column(length = 3)
    private String user_gender;

    @Column
    private Float user_weight;

    @Column
    private Float user_height;

    @Column(length = 50)
    private String user_fitness_level;

    @Column(length = 255)
    private String user_fitness_goal;

    @Column(length = 255)
    private String user_address;

    private LocalDateTime user_created_at;

    private LocalDateTime user_updated_at;

    @Column(length = 1)
    private Integer user_status;

    @Column(length = 255)
    private String user_photo;

}