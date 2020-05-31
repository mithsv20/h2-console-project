package com.inn.product.rest;

import com.inn.product.model.Customer;
import com.inn.product.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerRest {

    private Logger logger = LoggerFactory.getLogger(CustomerRest.class);

    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public List<Customer> getCustomers(){
        logger.info("inside getCustomers method");
        List<Customer> customers = customerService.getCustomers();
        logger.info("getting data {}", customers);
        return customers;
    }
}
