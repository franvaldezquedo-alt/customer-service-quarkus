package org.flcode.infraestructure.repository;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import org.flcode.infraestructure.entity.CustomerEntity;

public class CustomerRepository implements ReactivePanacheMongoRepository<CustomerEntity> {

}
