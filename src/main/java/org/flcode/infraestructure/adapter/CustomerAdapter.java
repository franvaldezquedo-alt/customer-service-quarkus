package org.flcode.infraestructure.adapter;

import io.smallrye.mutiny.Uni;
import org.flcode.application.ports.out.CustomerServiceOutput;
import org.flcode.domain.model.Customer;
import org.flcode.infraestructure.repository.CustomerRepository;
import java.util.List;

public class CustomerAdapter implements CustomerServiceOutput {

  private CustomerRepository repository;

  @Override
  public Uni<List<Customer>> getAllCustomers() {
    return repository.findAll();
  }

  @Override
  public Uni<Customer> save(Customer customer) {
    return null;
  }
}
