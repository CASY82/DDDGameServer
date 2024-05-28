package com.study.futurelab.infrastructure.jpa.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "game_user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "username")
    private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "nickname")
    private String nickName;
	
	@Column(name = "hp")
	private Integer hp;
	
	@Column(name = "mp")
	private Integer mp;
	
	@Column(name = "attack_rate")
	private Integer attackRate;
	
	@Column(name = "defence_rate")
	private Integer defenceRate;
	
	@Column(name = "exp")
	private Integer exp;

	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@Column(name = "updated_at")
	private Timestamp updatedAt;
}
