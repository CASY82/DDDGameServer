package com.study.futurelab.domain.user.character;

import lombok.Data;

@Data
public class CharacterStatus {
	private String nickName;
	private Integer hp;
	private Integer mp;
	private Integer attackRate;
	private Integer defenceRate;
	private Integer exp;
}
