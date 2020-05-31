package com.inn.product.service;

import com.inn.product.dao.CustomerDao;
import com.inn.product.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> getCustomers() {
        return customerDao.findAll();
    }

}
