package com.rinku.address.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rinku.address.entity.Address;
import com.rinku.address.mapper.AddressToAddressResponseMapper;
import com.rinku.address.model.AddressResponse;
import com.rinku.address.repo.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public AddressResponse getEmployeeAddress( Integer p_employeeId ) {
		Address l_address = addressRepository.findAddressByEmployeeId( p_employeeId );
		if( l_address == null ) {
			return null;
		}
		AddressToAddressResponseMapper l_addressToAddressResponseMapper = Mappers.getMapper( AddressToAddressResponseMapper.class );
		AddressResponse l_addressResponse = l_addressToAddressResponseMapper.mapAddressToAddressResponse( l_address );
		return l_addressResponse;
	}

}
