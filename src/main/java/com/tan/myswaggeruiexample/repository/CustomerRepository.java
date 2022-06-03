package com.tan.myswaggeruiexample.repository;

import com.tan.myswaggeruiexample.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
