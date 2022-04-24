package com.prb.bb.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prb.bb.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
