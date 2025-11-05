package org.flcode.infraestructure.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.flcode.domain.model.enums.CustomerStatus;
import org.flcode.domain.model.enums.CustomerType;
import org.flcode.domain.model.enums.DocumentType;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@MongoEntity(collection = "customers")
public class CustomerEntity extends ReactivePanacheMongoEntity {
  private Long id;
  private String customerCode;
  private CustomerType customerType;
  private CustomerStatus customerStatus;

  private DocumentType documentType;
  private String documentNumber;

  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String gender;

  private String businessName;
  private String tradeName;
  private String taxId;

  private String contactInfo;

  private String address;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String createdBy;
  private String updatedBy;
}
