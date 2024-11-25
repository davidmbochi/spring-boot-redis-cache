package com.javawhizz.spring_boot_cache.runner;

import com.javawhizz.spring_boot_cache.model.Customer;
import com.javawhizz.spring_boot_cache.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreateCustomers implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 0){
            List<Customer> customers = List.of(
                    new Customer("John", "Doe", "john@javawhizz.com"),
                    new Customer("Mary", "Public", "mary@javawhizz.com"),
                    new Customer("Steven", "Schapiro", "steven@javawhizz.com"),
                    new Customer("Khaligraph", "Jones", "jones@javawhizz.com"),
                    new Customer("Bety", "Kyalo", "betty@javawhizz.com")
            );
            customerRepository.saveAll(customers);
        }
    }
}
