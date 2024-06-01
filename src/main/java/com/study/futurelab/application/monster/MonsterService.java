package com.study.futurelab.application.monster;

import java.util.List;

import com.study.futurelab.infrastructure.jpa.entity.MonsterEntity;

public interface MonsterService {
	List<MonsterEntity> getMonsterList();
	MonsterEntity getMonster(String monsterName);
	MonsterEntity getRandomMonster();
}
