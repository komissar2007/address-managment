package com.slavarub.address;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.slavarub.address.datatype.Address;
import com.slavarub.address.dto.AddressDTO;
import com.slavarub.address.mappers.MapAddressToAddressDTO;

@Configuration
public class AppConfig {
	
	@Bean
	public AddressDTO addressDTO()
	{
		return new AddressDTO();
	}
	
	@Bean
	public Address address()
	{
		return new Address();
	}
	
	@Bean
	public MapAddressToAddressDTO mapAddressToAddressDTO()
	{
		return new MapAddressToAddressDTO();
	}

}
