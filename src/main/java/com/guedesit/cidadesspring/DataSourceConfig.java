package com.guedesit.cidadesspring;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	@Bean
	public DataSource getDataSource() {
		
		DataSourceBuilder builder = DataSourceBuilder.create();
		
		builder.driverClassName("com.mysql.cj.jdbc.Driver");
		builder.url("jdbc:mysql://localhost:3306/cidadesspring");
		builder.username("aurelio");
		builder.password("19122010");
		return builder.build();
	}
}
