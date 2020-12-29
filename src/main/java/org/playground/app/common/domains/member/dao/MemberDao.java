package org.playground.app.common.domains.member.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public int count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TEST", Integer.class);
    }
}
