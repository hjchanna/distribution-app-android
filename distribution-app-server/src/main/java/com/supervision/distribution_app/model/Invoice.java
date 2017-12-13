/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.model;

import java.util.List;

/**
 *
 * @author kalum
 */
public class Invoice {
    private InvSum invoiceSummary;
    private List<InvDet> invoiceDetailList;
    private List<InvChkDet> invoiceChequeDetailList;
    private List<PmtChkDet> chequeDetailList;

    public Invoice() {
    }

    public Invoice(InvSum invoiceSummary, List<InvDet> invoiceDetailList, List<InvChkDet> invoiceChequeDetailList, List<PmtChkDet> chequeDetailList) {
        this.invoiceSummary = invoiceSummary;
        this.invoiceDetailList = invoiceDetailList;
        this.invoiceChequeDetailList = invoiceChequeDetailList;
        this.chequeDetailList = chequeDetailList;
    }

    public InvSum getInvoiceSummary() {
        return invoiceSummary;
    }

    public void setInvoiceSummary(InvSum invoiceSummary) {
        this.invoiceSummary = invoiceSummary;
    }

    public List<InvDet> getInvoiceDetailList() {
        return invoiceDetailList;
    }

    public void setInvoiceDetailList(List<InvDet> invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }

    public List<InvChkDet> getInvoiceChequeDetailList() {
        return invoiceChequeDetailList;
    }

    public void setInvoiceChequeDetailList(List<InvChkDet> invoiceChequeDetailList) {
        this.invoiceChequeDetailList = invoiceChequeDetailList;
    }

    public List<PmtChkDet> getChequeDetailList() {
        return chequeDetailList;
    }

    public void setChequeDetailList(List<PmtChkDet> chequeDetailList) {
        this.chequeDetailList = chequeDetailList;
    }

    
    
}
