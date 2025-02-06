package com.berkayderin.services;

import com.berkayderin.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
