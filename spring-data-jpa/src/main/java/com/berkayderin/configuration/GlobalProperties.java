package com.berkayderin.configuration;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "app") // hepsi app ile başlayan property'leri alır
public class GlobalProperties {

    private List<Server> servers;
}
