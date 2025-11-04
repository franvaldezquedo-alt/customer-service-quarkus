package org.flcode.infraestructure.dtos.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class CreatePersonalCustomerRequest {
    @NotNull(message = "Document type is required")
    private String documentType; // DNI, CEX, PASSPORT

    @NotBlank(message = "Document number is required")
    @Size(min = 8, max = 12, message = "Document number must be between 8 and 12 characters")
    private String documentNumber;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Date of birth is required")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date format must be YYYY-MM-DD")
    private String dateOfBirth;

    @Pattern(regexp = "M|F|OTHER", message = "Gender must be M, F or OTHER")
    private String gender;

    @NotNull(message = "Contact information is required")
    private String contactInfo;

    @NotNull(message = "Address is required")
    private String address;

    private String customerProfile;
}
