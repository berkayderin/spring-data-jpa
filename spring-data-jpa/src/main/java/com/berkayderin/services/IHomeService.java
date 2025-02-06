package com.berkayderin.services;

import com.berkayderin.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
