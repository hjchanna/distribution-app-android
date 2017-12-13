/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.repository;

import com.supervision.distribution_app.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author kalum
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
    //get Customer by sales ref no
    public List<Customer> findBySRefNo(String salesRefNo);
    
    //get Customer max number
    @Query("select max(cast(cust.cusNo as int)) from Customer cust")
    public Integer findMaxCustomerNo();
}
