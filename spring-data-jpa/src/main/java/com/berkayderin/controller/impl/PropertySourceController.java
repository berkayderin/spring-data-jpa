package com.berkayderin.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayderin.configuration.DataSource;
import com.berkayderin.configuration.GlobalProperties;
import com.berkayderin.configuration.Server;

@RestController
@RequestMapping("/api")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/property")
    public DataSource getDataSource() {
        return null;
    }

    @GetMapping("/servers")
    public List<Server> getServers() {
        return globalProperties.getServers();
    }
}
