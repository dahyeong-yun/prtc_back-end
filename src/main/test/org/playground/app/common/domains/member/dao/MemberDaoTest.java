package org.playground.app.common.domains.member.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberDaoTest {


    @Autowired
    private MemberDao memberDao;

    @Test
    @DisplayName("JDBC 주입 테스트")
    void getJdbcTemplateTest() {
        System.out.println("memberDao.getJdbcTemplate = " + memberDao.getJdbcTemplate());
    }

    @Test
    @DisplayName("카운트 쿼리 테스트")
    void countQueryTest() {
        int result = memberDao.count();
        assertThat(result).isEqualTo(3);
    }

}