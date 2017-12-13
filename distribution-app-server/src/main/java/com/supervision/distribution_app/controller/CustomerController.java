/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.controller;

import com.supervision.distribution_app.model.Customer;
import com.supervision.distribution_app.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kalum
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1/distribution-app/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/get-customers-by-sales-ref-no/{salesRefNo}", method = RequestMethod.GET)
    public List<Customer> getCustomersByStrCity(@PathVariable String salesRefNo) {
        return customerService.getCustomersBySalesRefNo(salesRefNo);
    }

    @RequestMapping(value = "/save-customer", method = RequestMethod.POST)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
