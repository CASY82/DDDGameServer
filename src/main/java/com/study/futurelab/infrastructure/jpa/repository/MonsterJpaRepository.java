package com.study.futurelab.infrastructure.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.futurelab.infrastructure.jpa.entity.MonsterEntity;

public interface MonsterJpaRepository extends JpaRepository<MonsterEntity, Long> {
	MonsterEntity findByMonsterName(String monsterName);
}
