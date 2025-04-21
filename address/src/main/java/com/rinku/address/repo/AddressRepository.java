package com.rinku.address.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rinku.address.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	Address findAddressByEmployeeId( Integer p_employeeId );

}
