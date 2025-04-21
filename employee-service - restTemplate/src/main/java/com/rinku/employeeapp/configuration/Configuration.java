package com.rinku.employeeapp.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.context.annotation.Configuration
public class Configuration {

//	@Value( "${address.service.base.url:null}" )
//	private String p_addressServiceUrl;

//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory( DataSource p_dataSource ) {
//		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//		em.setDataSource( p_dataSource );
//		em.setPackagesToScan( new String[] { "com.rinku" } );
//
//		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		em.setJpaVendorAdapter( vendorAdapter );
//
//		Properties properties = new Properties();
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect"); // Manually set the dialect
//		properties.setProperty("hibernate.hbm2ddl.auto", "update"); // Set ddl-auto
//		em.setJpaProperties(properties);
//
//		return em;
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		return DataSourceBuilder.create()
//			.url( "jdbc:oracle:thin:@dlnxcassiopaedbdev03.marc.fr.ssg:1587:D19EFACT" )
//			.username( "EFACTDEV" )
//			.password( "TRES5PRG" )
//			.driverClassName( "oracle.jdbc.OracleDriver" )
//			.build();
//	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	public WebClient webClient() {
//		return WebClient.builder().baseUrl( p_addressServiceUrl ).build();
//	}

}
