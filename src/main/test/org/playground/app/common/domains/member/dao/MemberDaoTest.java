package org.playground.app.common.domains.member.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    @DisplayName("조회 쿼리 테스트")
    void findAll() {
        List<org.playground.app.common.domains.member.entity.Test> result = memberDao.findAll();

        for(int i = 0; i < result.size(); i++) {
            System.out.print(i + "번째 아이디= " + result.get(i).getId());
            System.out.println(" / " + i + "번째 이름= " + result.get(i).getName());
        }

        assertThat(result.size()).isEqualTo(3);

        
    }
}