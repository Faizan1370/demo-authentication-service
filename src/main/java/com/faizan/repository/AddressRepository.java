package com.faizan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faizan.entity.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
