package com.sideproject.chatfit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sideproject.chatfit.vo.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserId(String user_id);
}
