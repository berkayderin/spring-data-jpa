package com.berkayderin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayderin.configuration.DataSource;
import com.berkayderin.configuration.GlobalProperties;

@RestController
@RequestMapping("/api")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @RequestMapping("/property")
    public DataSource getDataSource() {
        DataSource dataSource = new DataSource();

        dataSource.setUrl(globalProperties.getUrl());
        dataSource.setUsername(globalProperties.getUsername());
        dataSource.setPassword(globalProperties.getPassword());

        return dataSource;
    }
}
