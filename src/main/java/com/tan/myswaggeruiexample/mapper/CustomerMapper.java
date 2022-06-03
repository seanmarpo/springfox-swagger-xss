package com.tan.myswaggeruiexample.mapper;

import com.tan.myswaggeruiexample.dto.Customer;
import com.tan.myswaggeruiexample.dto.CustomerRef;
import com.tan.myswaggeruiexample.entity.CustomerEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Objects;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
@MapperConfig(unmappedTargetPolicy = ReportingPolicy.ERROR, unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface CustomerMapper {

  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

  @Mappings({
      @Mapping(target = "id", ignore = true)
  })
  CustomerEntity toEntity(Customer customer);

  Customer toDto(CustomerEntity customerEntity);

  List<CustomerEntity> toEntityList(List<Customer> customerList);

  List<Customer> toDtoList(List<CustomerEntity> customerEntityList);

  @BeanMapping(ignoreUnmappedSourceProperties = {"customerType", "fullName"})
  CustomerRef toDtoRef(CustomerEntity customerEntity);

  List<CustomerRef> toDtoRefList(List<CustomerEntity> customerEntityList);

  @AfterMapping
  default void setEntityId(Customer customer, @MappingTarget CustomerEntity customerEntity) {
    if(Objects.nonNull(customer.getId()))
      customerEntity.setId(customer.getId());
  }
}
