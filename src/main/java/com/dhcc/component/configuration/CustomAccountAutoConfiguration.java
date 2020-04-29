package com.dhcc.component.configuration;

import com.dhcc.component.po.CustomAccount;
import com.dhcc.component.properties.CustomAccountProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用户账号配置类
 * @author chenbin
 * @Configuration 注释使类成为bean的工厂。
 * @EnableConfigurationProperties 注解使@ConfigurationProperties注解生效。
 *
 */
@Configuration
@EnableConfigurationProperties(CustomAccountProperties.class)
public class CustomAccountAutoConfiguration {

    /**
     * @Bean 注入到spring容器中
     * @ConditionalOnMissingBean 在spring容器中找不到Bean的条件时生效
     * @ConditionalOnProperty 在yml中insight.account.enable = true 时生效
     * @param properties
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix="insight.account",name="enable",havingValue="true")
    public CustomAccount getCustomAccountBean(CustomAccountProperties properties){
        CustomAccount customAccount = new CustomAccount();
        customAccount.setSecrectId( properties.getSecrectId() );
        customAccount.setSecrectKey( properties.getSecrectKey() );
        customAccount.setEnable( properties.getEnable() );
        return customAccount;
    }
}
