package com.study.futurelab.application.user.impl;

import org.springframework.stereotype.Service;

import com.study.futurelab.application.user.UserService;
import com.study.futurelab.infrastructure.jpa.entity.UserEntity;
import com.study.futurelab.infrastructure.jpa.repository.UserJpaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameUserService implements UserService {
	
	private final UserJpaRepository repository;

	@Override
	public UserEntity getUserData(String username) {
		return this.repository.findByUserName(username);
	}

}
