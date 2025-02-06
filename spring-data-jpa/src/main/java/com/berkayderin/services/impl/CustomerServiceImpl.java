package com.berkayderin.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkayderin.dto.DtoAddress;
import com.berkayderin.dto.DtoCustomer;
import com.berkayderin.entities.Customer;
import com.berkayderin.repository.CustomerRepository;
import com.berkayderin.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent()) {
            DtoCustomer dtoCustomer = new DtoCustomer();
            BeanUtils.copyProperties(customer.get(), dtoCustomer);

            DtoAddress dtoAddress = new DtoAddress();
            BeanUtils.copyProperties(customer.get().getAddress(), dtoAddress);
            dtoCustomer.setAddress(dtoAddress);

            return dtoCustomer;
        }

        return null;
    }

}
