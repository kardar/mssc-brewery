package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface MapStruct {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
