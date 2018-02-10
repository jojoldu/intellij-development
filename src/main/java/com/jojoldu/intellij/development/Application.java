package com.jojoldu.intellij.development;

import lombok.AllArgsConstructor;
import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

@AllArgsConstructor
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	@Profile("local")
	@ConfigurationProperties("spring.datasource") // yml의 설정값을 Set한다.
	public DataSource dataSource() throws SQLException {
		Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
		return new org.apache.tomcat.jdbc.pool.DataSource();
	}


}
