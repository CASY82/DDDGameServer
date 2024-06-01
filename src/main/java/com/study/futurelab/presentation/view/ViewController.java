package com.study.futurelab.presentation.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;

import com.study.futurelab.application.item.ItemService;
import com.study.futurelab.application.monster.MonsterService;
import com.study.futurelab.application.user.UserService;
import com.study.futurelab.infrastructure.jpa.entity.UserEntity;
import com.study.futurelab.infrastructure.jpa.entity.ItemEntity;
import com.study.futurelab.infrastructure.jpa.entity.MonsterEntity;

import lombok.RequiredArgsConstructor;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ViewController {
	
	private final UserService userService;
	private final ItemService itemService;
	private final MonsterService monsterService;
	
	@GetMapping("/")
	public String getMainPage(Model model, Authentication authentication) {
		UserEntity user = this.userService.getUserData(authentication.getName());
		List<MonsterEntity> monsters = this.monsterService.getMonsterList();
		model.addAttribute("user", user);
		model.addAttribute("monster", monsters);
		
		return "index";
	}
	
	@GetMapping("/chat")
	public String getChattingPage(Model model) {
		return "chat";
	}
	
	@GetMapping("/login_page")
	public String getLoginPage(Model model) {
		return "signin";
	}
	
	@GetMapping("/randbox")
	public String getRandomBoxPage(Model model) {
		List<ItemEntity> items = this.itemService.getItemList();
		model.addAttribute("items", items);
		
		return "randbox";
	}
	
	@GetMapping("/inventory")
	public String getInventoryPage(Model model) {
		List<ItemEntity> items = this.itemService.getItemList();
		model.addAttribute("items", items);
		
		return "inventory";
	}
}
