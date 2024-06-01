package com.study.futurelab.presentation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.futurelab.application.item.ItemService;
import com.study.futurelab.infrastructure.jpa.entity.ItemEntity;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class GameRestApi {
	
	private final ItemService itemService;
	
	@GetMapping("/item/get/random")
	public ItemEntity getRandomItem() {
		return this.itemService.getRandomItem();
	}
}
