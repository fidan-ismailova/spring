package az.com.fidan.spring.service;

import az.com.fidan.spring.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);

    CustomerDTO getCustomer(int id);
}
