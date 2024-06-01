package com.study.futurelab.application.item;

import java.util.List;

import com.study.futurelab.infrastructure.jpa.entity.ItemEntity;

public interface ItemService {
	ItemEntity getItem(String itemName);
	List<ItemEntity> getItemList();
	ItemEntity getRandomItem();
}
