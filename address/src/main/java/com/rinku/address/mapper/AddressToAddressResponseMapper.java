package com.rinku.address.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.rinku.address.entity.Address;
import com.rinku.address.model.AddressResponse;

@Mapper
public interface AddressToAddressResponseMapper {

	@Mapping( source = "id", target = "addressId" )
	@Mapping( source = "street", target = "street" )
	@Mapping( source = "colony", target = "colony" )
	@Mapping( source = "postalCode", target = "postalCode" )
	@Mapping( source = "city", target = "city" )
	@Mapping( source = "state", target = "state" )
	@Mapping( source = "country", target = "country" )
	public AddressResponse mapAddressToAddressResponse( Address p_address );

}
