package com.slavarub.address.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "Address")
public class AddressDTO {
	

	@Id
	private String id;
	
	private String city;
	private String street;
	private String homeNumber;
	
}
