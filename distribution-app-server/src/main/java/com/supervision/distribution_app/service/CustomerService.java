/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.service;

import com.supervision.distribution_app.model.Customer;
import com.supervision.distribution_app.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kalum
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomersBySalesRefNo(String salesRefNo) {
        return customerRepository.findBySRefNo(salesRefNo);
    }

    public Customer saveCustomer(Customer customer) {
        if (null == customer.getCustNo()) {
            Integer maxCustomerNo = customerRepository.findMaxCustomerNo();
            Integer newCustNo = maxCustomerNo + 1;
            customer.setCustNo(newCustNo.toString());
        }
        return customerRepository.save(customer);
    }

}
