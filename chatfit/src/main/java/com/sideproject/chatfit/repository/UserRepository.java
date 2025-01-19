package com.sideproject.chatfit.repository;

import com.sideproject.chatfit.entity.ChatUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ChatUser, Integer> {
}
