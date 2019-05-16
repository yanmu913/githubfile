package com.info;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbox-provider.xml"})
@MapperScan("com.info.dao")
public class ProviderApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProviderApplication.class, args);
		System.in.read();
	}
	
private static Logger logger = Logger.getLogger(ProviderApplication.class);
	

}
