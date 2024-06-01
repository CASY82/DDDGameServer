package com.study.futurelab.application.item.impl;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.study.futurelab.application.item.ItemService;
import com.study.futurelab.infrastructure.jpa.entity.ItemEntity;
import com.study.futurelab.infrastructure.jpa.repository.ItemJpaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameItemService implements ItemService {

	private final ItemJpaRepository repository;
	
	@Override
	public ItemEntity getItem(String itemName) {
		return this.repository.findByItemName(itemName);
	}

	@Override
	public List<ItemEntity> getItemList() {
		return this.repository.findAll();
	}

	@Override
	public ItemEntity getRandomItem() {
		List<ItemEntity> items = this.repository.findAll();
        Random random = new Random(System.currentTimeMillis());
        int index = random.nextInt(items.size());
		
		return items.get(index);
	}

}
