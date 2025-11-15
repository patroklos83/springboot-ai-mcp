package com.patroclos.mcpserver.configs;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.patroclos.mcpserver.services.*;

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider toolCallbackProvider(
    		DragonballService dragonballService,
    		PostgresService postgresService) {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(dragonballService, postgresService)
                .build();
    }

}
