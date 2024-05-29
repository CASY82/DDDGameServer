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
	
	@Column(name = "hp", columnDefinition = "INTEGER DEFAULT 100")
	private Integer hp;
	
	@Column(name = "mp", columnDefinition = "INTEGER DEFAULT 100")
	private Integer mp;
	
	@Column(name = "attack_rate", columnDefinition = "INTEGER DEFAULT 10")
	private Integer attackRate;
	
	@Column(name = "defence_rate", columnDefinition = "INTEGER DEFAULT 10")
	private Integer defenceRate;
	
	@Column(name = "exp", columnDefinition = "INTEGER DEFAULT 0")
	private Integer exp;

	@Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp createdAt;
	
	@Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updatedAt;
}
