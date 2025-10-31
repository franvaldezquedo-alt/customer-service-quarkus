package org.flcode.domain.model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Customer {

private Long id;
private String customerCode;
private CustomerType customerType;
private CustomerStatus customerStatus;

private CodumentType documentType;
private String documentNumber;

private String firstName;
private String lastName;
private String dateOfBirth;
private String gender;

private String businessName;
private String tradeName;
private String taxId;

private ContactInfo contactInfo;

private String address;

private LocalDateTime createdAt;
private LocalDateTime updatedAt;
private String createdBy;
private String updatedBy;
}
