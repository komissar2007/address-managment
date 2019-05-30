package com.slavarub.address.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.slavarub.address.datatype.Address;
import com.slavarub.address.dto.AddressDTO;
import com.slavarub.address.mappers.MapAddressToAddressDTO;
import com.slavarub.address.repository.AddressRepository;

@RestController
public class AddressManagementController {

	@Autowired
	protected AddressRepository repository;

	@Autowired
	protected MapAddressToAddressDTO mapAddressToAddressDTO;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/address{id}")
	public Optional<AddressDTO> getAddress(@RequestParam("id") String id) {
		return repository.findById(id);
	}

	@PostMapping("/address")
	@ResponseStatus(HttpStatus.OK)
	public AddressDTO addAddress(@RequestBody Address address) {

		AddressDTO addressDTO = mapAddressToAddressDTO.map(address);
		repository.save(addressDTO);
		return addressDTO;
	}

	@PostMapping("/address{id}")
	public AddressDTO editAdress(@RequestBody Address address, @PathVariable String id) {
		Optional<AddressDTO> addressDTO = repository.findById(id);
		AddressDTO newAddressDTO = mapAddressToAddressDTO.map(address);
		newAddressDTO.setId(addressDTO.get().getId());
		return repository.save(newAddressDTO);

	}

	@GetMapping("/address/delete/{id}")

	@ResponseStatus(HttpStatus.OK)
	public void deleteAddress(@RequestParam String id) {

		repository.deleteById(id);

	}

}
