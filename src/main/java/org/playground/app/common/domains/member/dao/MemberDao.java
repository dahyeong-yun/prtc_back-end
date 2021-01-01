package org.playground.app.common.domains.member.dao;

import lombok.RequiredArgsConstructor;
import org.playground.app.common.domains.member.entity.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public List<Test> findAll() {
        return jdbcTemplate.query("SELECT * FROM TEST", new RowMapper<Test>() {
            @Override
            public Test mapRow(ResultSet resultSet, int i) throws SQLException {
                Test test = new Test();
                test.setId(resultSet.getInt("id"));
                test.setName(resultSet.getString("name"));
                return test;
            }
        });
    }

    public Test findById(int id) {
        return jdbcTemplate.queryForObject("SELECT t.id, t.name FROM TEST t WHERE id = ?",
                (rs, rowNum) -> new Test(rs.getInt("id"), rs.getString("name")),
                id);
    }

}
