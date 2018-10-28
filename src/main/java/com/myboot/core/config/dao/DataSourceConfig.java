package com.myboot.core.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;
//@Configuration注解表示该类是Spring容器类
@Configuration
@MapperScan("com.myboot.core.dao")
public class DataSourceConfig {

    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //dataSource.setDriverClass(jdbcDriver);
        try {
            dataSource.setDriverClass(jdbcDriver);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        // 配置c3p0连接池的私有属性
        // 连接池最大线程数
        dataSource.setMaxPoolSize(30);
        // 连接池最小线程数
        dataSource.setMinPoolSize(10);
        // 关闭连接后不自动commit
        dataSource.setAutoCommitOnClose(false);
        // 连接超时时间
        dataSource.setCheckoutTimeout(10000);
        // 连接失败重试次数
        dataSource.setAcquireRetryAttempts(2);
        return dataSource;
    }
}
