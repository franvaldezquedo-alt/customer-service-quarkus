package org.flcode.infraestructure.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateBusinessCustomerRequest {

    @NotBlank(message = "RUC is required")
    @Size(min = 11, max = 11, message = "RUC must be 11 characters")
    private String taxId;

    @NotBlank(message = "Business name is required")
    @Size(min = 2, max = 100, message = "Business name must be between 2 and 100 characters")
    private String businessName;

    @Size(max = 100, message = "Trade name must not exceed 100 characters")
    private String tradeName;

    @NotBlank(message = "Legal representative is required")
    private String legalRepresentative;

    @NotNull(message = "Contact information is required")
    private String contactInfo;

    @NotNull(message = "Address is required")
    private String address;

    private String customerProfile;
}
