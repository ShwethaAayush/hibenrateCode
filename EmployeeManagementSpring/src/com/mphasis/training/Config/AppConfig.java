package com.mphasis.training.Config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.mphasis.training")
public class AppConfig {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("java188");
		ds.setPassword("java188");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		Properties p = new Properties();
		p.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		p.put("hibernate.hbm2ddl.auto", "create");
		p.put("hibernate.show_sql", "true");
		sessionFactory.setHibernateProperties(p);
		//lf.setPackagesToScan("com.mphasis.training.Entity");
		sessionFactory.setPackagesToScan("com.mphasis.training.Entity");
//		sessionFactory.setAnnotatedClasses("com.mphasis.training.Entity.Employee");
//		sessionFactory.setPackagesToScan("com.mphasis.training.Entity.Department");
//		sessionFactory.setPackagesToScan("com.mphasis.training.Entity.Job");
//		sessionFactory.setPackagesToScan("com.mphasis.training.Entity.Leave");
//		sessionFactory.setPackagesToScan("com.mphasis.training.Entity.Location");
//		sessionFactory.setPackagesToScan("com.mphasis.training.Entity.Login");
		return sessionFactory;
		
	}
		
}
