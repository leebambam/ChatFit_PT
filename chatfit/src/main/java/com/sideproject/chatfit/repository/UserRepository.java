package com.sideproject.chatfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sideproject.chatfit.vo.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
