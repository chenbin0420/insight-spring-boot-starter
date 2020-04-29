package com.dhcc.component.configuration;

import com.dhcc.component.po.Insight;
import com.dhcc.component.properties.InsightProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(InsightProperties.class)
public class InsightAutoConfiguration {

    @Bean
    public Insight getInsightBean(InsightProperties properties){
        Insight insight = new Insight();
        insight.setTitle(properties.getTitle());
        insight.setDescription(properties.getDescription());
        insight.setVersion(properties.getVersion());
        insight.setContactName(properties.getContactName());
        insight.setContactEmail(properties.getContactEmail());
        insight.setContactUrl(properties.getContactUrl());
        return insight;
    }
}



