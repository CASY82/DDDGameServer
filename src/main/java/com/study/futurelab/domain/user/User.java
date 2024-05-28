package com.study.futurelab.domain.user;

import java.time.Instant;

import com.study.futurelab.domain.common.DomainEntity;
import com.study.futurelab.domain.user.character.CharacterStatus;
import com.study.futurelab.domain.user.login.LoginInfo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@DomainEntity
public class User {
	private LoginInfo loginInfo;
	private CharacterStatus status;
	private Instant createdAt;
	private Instant updatedAt;
	
	
}
