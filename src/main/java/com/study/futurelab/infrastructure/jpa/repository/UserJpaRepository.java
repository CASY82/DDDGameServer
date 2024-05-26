package com.study.futurelab.infrastructure.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.futurelab.infrastructure.jpa.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByUsername(String userName);
}
