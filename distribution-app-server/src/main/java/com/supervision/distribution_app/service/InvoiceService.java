/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.service;

import com.supervision.distribution_app.model.InvSum;
import com.supervision.distribution_app.model.Invoice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.supervision.distribution_app.repository.InvSumRepository;

/**
 *
 * @author kalum
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class InvoiceService {

    @Autowired
    private InvSumRepository invSumRepository;

    public List<InvSum> getAllInvoice() {
        return invSumRepository.findAll();
    }
    
    public InvSum saveInvoice(Invoice invoice) {
        String invNo = invoice.getInvoiceSummary().getInvNo();

        InvSum invSum = invSumRepository.save(invoice.getInvoiceSummary());

        return invSum;
    }

}
