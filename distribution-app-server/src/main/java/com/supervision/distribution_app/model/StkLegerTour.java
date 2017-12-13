/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author kalum
 */
@Entity
@Table(name = "stklegertour")
public class StkLegerTour implements Serializable {
    
    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "stkno")
    private Integer stkNo;

    @Column(name = "tno")
    private String tNo;
    
    @Column(name = "stkldate")
    private String stklDate;
    
    @Column(name = "category")
    private String Category;
    
    @Column(name = "fname")
    private String fName;
    
    @Column(name = "refno")
    private String refNo;
    
    @Column(name = "des")
    private String des;
    
    @Column(name = "prono")
    private String proNo;
    
    @Column(name = "qty")
    private BigDecimal qty;
    
    @Column(name = "amt")
    private BigDecimal amt;
    
    @Column(name = "sysdate")
    @Temporal(TemporalType.DATE)
    private Date sysDate;
    
    @Column(name = "useriD")
    private String userID;

    public StkLegerTour() {
    }

    public StkLegerTour(Integer stkNo, String tNo, String stklDate, String Category, String fName, String refNo, String des, String proNo, BigDecimal qty, BigDecimal amt, Date sysDate, String userID) {
        this.stkNo = stkNo;
        this.tNo = tNo;
        this.stklDate = stklDate;
        this.Category = Category;
        this.fName = fName;
        this.refNo = refNo;
        this.des = des;
        this.proNo = proNo;
        this.qty = qty;
        this.amt = amt;
        this.sysDate = sysDate;
        this.userID = userID;
    }
    
    public Integer getStkNo() {
        return stkNo;
    }

    public void setStkNo(Integer stkNo) {
        this.stkNo = stkNo;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    public String getStkLDate() {
        return stklDate;
    }

    public void setStkLDate(String stklDate) {
        this.stklDate = stklDate;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
}
