package com.berkayderin.controller;

import com.berkayderin.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
