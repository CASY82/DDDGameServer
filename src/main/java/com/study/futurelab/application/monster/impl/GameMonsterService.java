package com.study.futurelab.application.monster.impl;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.study.futurelab.application.monster.MonsterService;
import com.study.futurelab.infrastructure.jpa.entity.MonsterEntity;
import com.study.futurelab.infrastructure.jpa.repository.MonsterJpaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameMonsterService implements MonsterService {

	private final MonsterJpaRepository repository;
	
	@Override
	public List<MonsterEntity> getMonsterList() {
		return this.repository.findAll();
	}

	@Override
	public MonsterEntity getMonster(String monsterName) {
		return this.repository.findByMonsterName(monsterName);
	}

	@Override
	public MonsterEntity getRandomMonster() {
		List<MonsterEntity> monsters = this.repository.findAll();
        Random random = new Random(System.currentTimeMillis());
        int index = random.nextInt(monsters.size());
        
        return monsters.get(index);
	}

}
