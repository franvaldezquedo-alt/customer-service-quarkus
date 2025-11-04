package org.flcode.infraestructure.dtos.response;

import org.flcode.domain.model.Customer;
import org.flcode.domain.model.MetaData;

import java.util.List;

public class CustomerResponse {
    private String success;
    private String message;
    private List<Customer> data;
    private ErrorCustomer error;
    private MetaData metadata;
}
