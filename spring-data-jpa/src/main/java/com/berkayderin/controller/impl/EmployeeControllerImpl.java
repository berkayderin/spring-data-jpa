package com.berkayderin.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayderin.controller.IEmployeeController;
import com.berkayderin.dto.DtoEmployee;
import com.berkayderin.services.IEmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employee")
    @Override
    public List<DtoEmployee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }

}
