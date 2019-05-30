package com.slavarub.address.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.slavarub.address.dto.AddressDTO;

public interface AddressRepository extends MongoRepository<AddressDTO, String>{

}
