package com.sideproject.chatfit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sideproject.chatfit.vo.user.UserVO;

public interface UserRepository extends JpaRepository<UserVO, Integer>{
	

}
