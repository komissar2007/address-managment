package com.slavarub.address.mappers;

import org.springframework.beans.factory.annotation.Autowired;

import com.slavarub.address.datatype.Address;
import com.slavarub.address.dto.AddressDTO;

public class MapAddressToAddressDTO {
	
	@Autowired
	protected AddressDTO addressDTO;
	
	
	public AddressDTO map(Address address)
	{
		addressDTO.setId(address.getId());
		addressDTO.setCity(address.getCity());
		addressDTO.setStreet(address.getStreet());
		addressDTO.setHomeNumber(address.getHomeNumber());
		return addressDTO;
	}

}
