/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.controller;

import com.supervision.distribution_app.model.InvSum;
import com.supervision.distribution_app.model.Invoice;
import com.supervision.distribution_app.service.InvoiceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/api/v1/distribution-app/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(method = RequestMethod.GET)
    public List<InvSum> getAllInvoice() {
        return invoiceService.getAllInvoice();
    }

    @RequestMapping(value = "/save-invoice", method = RequestMethod.POST)
    public InvSum saveInvoice(@RequestBody Invoice invoice) {
        return invoiceService.saveInvoice(invoice);
    }
}
