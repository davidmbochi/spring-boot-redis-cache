package com.javawhizz.spring_boot_cache.repository;

import com.javawhizz.spring_boot_cache.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
