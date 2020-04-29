package com.dhcc.component.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 使用@ConfigurationProperties注解将配置文件（yml/properties）中指定前缀的配置转为bean。
 *
 * @author chenbin
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "insight.account")
public class CustomAccountProperties {
    private String secrectId;
    private String secrectKey;
    private Boolean enable;
}
