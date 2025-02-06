package com.berkayderin.controller;

import com.berkayderin.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);

}
