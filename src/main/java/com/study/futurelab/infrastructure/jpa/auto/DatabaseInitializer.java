package com.study.futurelab.infrastructure.jpa.auto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * H2 DB 실행시 임의 값을 넣기 위한 클래스
 */
@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    public DatabaseInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("INSERT INTO game_user (username, password, nickname, hp, mp, attack_rate, defence_rate, exp)"
        		+ "VALUES ('player1', '1234', 'hero1', 100, 50, 10, 5, 0);");
        jdbcTemplate.execute("INSERT INTO game_user (username, password, nickname, hp, mp, attack_rate, defence_rate, exp)"
        		+ "VALUES ('player2', '1234', 'hero2', 200, 100, 20, 10, 0);");
    }
}
