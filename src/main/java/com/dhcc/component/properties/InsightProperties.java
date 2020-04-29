package com.dhcc.component.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = "insight.param")
public class InsightProperties {
    private String title;
    private String description;
    private String version;
    private String contactName;
    private String contactEmail;
    private String contactUrl;
}
