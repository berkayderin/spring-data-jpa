package com.berkayderin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayderin.controller.ICustomerController;
import com.berkayderin.dto.DtoCustomer;
import com.berkayderin.services.ICustomerService;

@RestController
@RequestMapping("/api")
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {

        return customerService.findCustomerById(id);
    }

}
