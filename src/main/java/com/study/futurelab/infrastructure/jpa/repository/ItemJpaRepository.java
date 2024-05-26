package com.study.futurelab.infrastructure.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.futurelab.infrastructure.jpa.entity.ItemEntity;

public interface ItemJpaRepository extends JpaRepository<ItemEntity, Long> {
	ItemEntity findByUsername(String itemName);
}
