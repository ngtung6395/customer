package service;

import models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer c);

    Customer findById(int id);

    void update(int id, Customer c);

    void remove(int id);
}
