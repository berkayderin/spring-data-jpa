package com.berkayderin.services;

import com.berkayderin.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
