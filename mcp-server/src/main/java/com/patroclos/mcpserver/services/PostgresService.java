package com.patroclos.mcpserver.services;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class PostgresService {

    private static final Logger logger = LoggerFactory.getLogger(PostgresService.class);
    private final JdbcTemplate jdbcTemplate;

    /**
     * Execute a complex SQL query and return results.
     */
    @Tool(description = "[Postgres] Execute a complex query with the table characters and columns name, info."
    		+ "This query returns information, info about dragonball characters.")
    public List<Map<String, Object>> executeComplexQuery(String sql) {
        logger.info("Executing complex SQL query: {}", sql);
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
}
