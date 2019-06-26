/**
 * 
 */
package com.netlingo.notification.email.config.hikari;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HikariDataSourceConfig {
	private static Logger log = LoggerFactory.getLogger(HikariDataSourceConfig.class);
	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource() {
		log.info("-------------INITIALIZING DATA SOURCE--------------");
		return DataSourceBuilder.create().build();
	}
}
