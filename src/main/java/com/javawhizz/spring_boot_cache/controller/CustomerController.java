package com.javawhizz.spring_boot_cache.controller;

import com.javawhizz.spring_boot_cache.model.Customer;
import com.javawhizz.spring_boot_cache.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping
    @Cacheable("customer-all")
    @Transactional(readOnly = true)
    public Iterable<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
}
