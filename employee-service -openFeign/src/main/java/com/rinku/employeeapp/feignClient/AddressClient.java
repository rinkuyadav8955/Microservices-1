package com.rinku.employeeapp.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.rinku.employeeapp.model.AddressResponse;


@FeignClient(name = "address-service", url = "http://127.0.0.1:8080", path = "/api/v1")
public interface AddressClient {

	@GetMapping("/address/{id}")
	AddressResponse getAddressById(@PathVariable("id") Integer id);
}