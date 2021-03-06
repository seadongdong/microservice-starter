//package com.yonyou.cloud.zuul.db.config;
//
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.bind.RelaxedPropertyResolver;
//import org.springframework.context.EnvironmentAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//
//import tk.mybatis.spring.mapper.MapperScannerConfigurer;
//
///**
// * mybatis mapper 扫描配置类
// * 
// * @author joy
// * @date 2016年12月15日
// * @since 1.7
// */
//@Configuration
//@AutoConfigureAfter(ZuulMybatisConfiguration.class)
//public class ZuulMapperConfiguration implements EnvironmentAware {
//
//    private RelaxedPropertyResolver propertyResolver;
//
//    private String basePackage;
//    
//
//    @Bean
//    public MapperScannerConfigurer zuulMapperScannerConfigurer(Environment environment){
//
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
////        mapperScannerConfigurer.setSqlSessionFactory(sqlSessionFactory);
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("zuulSqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage(basePackage);
//        return mapperScannerConfigurer;
//    }
//
//
//    @Override
//    public void setEnvironment(Environment environment) {
//        this.propertyResolver = new RelaxedPropertyResolver(environment, null);
//        this.basePackage = "com.yonyou.cloud.zuul.db.mapper";//propertyResolver.getProperty("mybatis.basepackage");
//    }
//}