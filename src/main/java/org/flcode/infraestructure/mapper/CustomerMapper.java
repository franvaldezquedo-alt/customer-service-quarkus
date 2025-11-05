package org.flcode.infraestructure.mapper;

import org.flcode.domain.model.Customer;
import org.flcode.infraestructure.entity.CustomerEntity;

public class CustomerMapper {

  public CustomerEntity toEntity(Customer customer) {
    return CustomerEntity.builder()
          .id(customer.getId())
          .customerCode(customer.getCustomerCode())
          .customerType(customer.getCustomerType())
          .customerStatus(customer.getCustomerStatus())
          .documentType(customer.getDocumentType())
          .documentNumber(customer.getDocumentNumber())
          .firstName(customer.getFirstName())
          .lastName(customer.getLastName())
          .dateOfBirth(customer.getDateOfBirth())
          .gender(customer.getGender())
          .businessName(customer.getBusinessName())
          .tradeName(customer.getTradeName())
          .taxId(customer.getTaxId())
          .contactInfo(customer.getContactInfo())
          .address(customer.getAddress())
          .createdAt(customer.getCreatedAt())
          .updatedAt(customer.getUpdatedAt())
          .createdBy(customer.getCreatedBy())
          .updatedBy(customer.getUpdatedBy())
          .build();
  }

  public Customer toDomain(CustomerEntity entity) {
    return Customer.builder()
          .id(entity.getId())
          .customerCode(entity.getCustomerCode())
          .customerType(entity.getCustomerType())
          .customerStatus(entity.getCustomerStatus())
          .documentType(entity.getDocumentType())
          .documentNumber(entity.getDocumentNumber())
          .firstName(entity.getFirstName())
          .lastName(entity.getLastName())
          .dateOfBirth(entity.getDateOfBirth())
          .gender(entity.getGender())
          .businessName(entity.getBusinessName())
          .tradeName(entity.getTradeName())
          .taxId(entity.getTaxId())
          .contactInfo(entity.getContactInfo())
          .address(entity.getAddress())
          .createdAt(entity.getCreatedAt())
          .updatedAt(entity.getUpdatedAt())
          .createdBy(entity.getCreatedBy())
          .updatedBy(entity.getUpdatedBy())
          .build();
  }
}
