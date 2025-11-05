package org.flcode.application.service;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.flcode.application.ports.in.CustomerInput;
import org.flcode.application.ports.out.CustomerServiceOutput;
import org.flcode.domain.model.Customer;
import java.util.List;

@ApplicationScoped
public class CustomerService implements CustomerInput {

  private final CustomerServiceOutput customerServiceOutput;

  public CustomerService(CustomerServiceOutput customerServiceOutput) {
    this.customerServiceOutput = customerServiceOutput;
  }

  @Override
  public Uni<List<Customer>> getAllCustomers() {
    return customerServiceOutput.getAllCustomers();
  }

  @Override
  public Uni<Customer> save(Customer customer) {
    return customerServiceOutput.save(customer);
  }
}
