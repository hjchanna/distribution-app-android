/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kalum
 */
@Entity
@Table(name = "invdet")
public class InvDet implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "invno")
    private String invNo;
    
    @Id
    @Basic(optional = false)
    @Column(name = "prono")
    private String proNo;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "qty")
    private BigDecimal qty;

    @Column(name = "ival")
    private BigDecimal iVal;

    @Column(name = "dp")
    private BigDecimal dp;

    @Column(name = "dv")
    private BigDecimal dv;

    @Column(name = "fval")
    private BigDecimal fVal;

    @Column(name = "icost")
    private Float iCost;

    public InvDet() {
    }

    public InvDet(String invNo, String proNo, BigDecimal price, BigDecimal qty, BigDecimal iVal, BigDecimal dp, BigDecimal dv, BigDecimal fVal, Float iCost) {
        this.invNo = invNo;
        this.proNo = proNo;
        this.price = price;
        this.qty = qty;
        this.iVal = iVal;
        this.dp = dp;
        this.dv = dv;
        this.fVal = fVal;
        this.iCost = iCost;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getiVal() {
        return iVal;
    }

    public void setiVal(BigDecimal iVal) {
        this.iVal = iVal;
    }

    public BigDecimal getDp() {
        return dp;
    }

    public void setDp(BigDecimal dp) {
        this.dp = dp;
    }

    public BigDecimal getDv() {
        return dv;
    }

    public void setDv(BigDecimal dv) {
        this.dv = dv;
    }

    public BigDecimal getfVal() {
        return fVal;
    }

    public void setfVal(BigDecimal fVal) {
        this.fVal = fVal;
    }

    public Float getiCost() {
        return iCost;
    }

    public void setiCost(Float iCost) {
        this.iCost = iCost;
    }

}
