package com.berkayderin.controller;

import com.berkayderin.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);
}
