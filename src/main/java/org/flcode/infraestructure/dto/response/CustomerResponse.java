package org.flcode.infraestructure.dto.response;

import org.flcode.domain.model.Customer;

import java.util.List;

public class CustomerResponse {
    private String success;
    private String message;
    private List<Customer> data;
    private ErrorResponse error;
}
