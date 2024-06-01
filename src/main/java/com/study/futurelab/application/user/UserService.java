package com.study.futurelab.application.user;

import com.study.futurelab.infrastructure.jpa.entity.UserEntity;

public interface UserService {
	UserEntity getUserData(String username);
}
