package com.berkayderin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berkayderin.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
