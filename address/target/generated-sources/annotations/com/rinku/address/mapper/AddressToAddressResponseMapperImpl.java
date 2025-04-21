package com.rinku.address.mapper;

import com.rinku.address.entity.Address;
import com.rinku.address.model.AddressResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-11T21:33:53+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
public class AddressToAddressResponseMapperImpl implements AddressToAddressResponseMapper {

    @Override
    public AddressResponse mapAddressToAddressResponse(Address p_address) {
        if ( p_address == null ) {
            return null;
        }

        AddressResponse addressResponse = new AddressResponse();

        addressResponse.setAddressId( p_address.getId() );
        addressResponse.setStreet( p_address.getStreet() );
        addressResponse.setColony( p_address.getColony() );
        addressResponse.setPostalCode( p_address.getPostalCode() );
        addressResponse.setCity( p_address.getCity() );
        addressResponse.setState( p_address.getState() );
        addressResponse.setCountry( p_address.getCountry() );

        return addressResponse;
    }
}
