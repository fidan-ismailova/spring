package az.com.fidan.spring.service.impl;

import az.com.fidan.spring.model.CustomerDTO;
import az.com.fidan.spring.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceInMemoryImpl implements CustomerService {
    private Map<Integer, CustomerDTO> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id, name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
}
