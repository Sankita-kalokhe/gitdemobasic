package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl
{
    @Autowired
    CustomerRepository customerRepositoryImpl;
    public Customer saveData(Customer customer)
    {
        return customerRepositoryImpl.save(customer);
    }
    public List<Customer>getAllData()
    {
        return customerRepositoryImpl.findAll();

    }
}
