package org.flcode.application.ports.out;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.flcode.domain.model.Customer;
import java.util.List;

public interface CustomerServiceOutput {
  Uni<List<Customer>> getAllCustomers();

  Uni<Customer> save(Customer customer);
}
