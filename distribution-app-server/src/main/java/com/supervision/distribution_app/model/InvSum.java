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
@Table(name = "invsum")
public class InvSum implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "invno")
    private String invNo;

    @Column(name = "fname")
    private String fName;

    @Column(name = "invdate")
    @Temporal(TemporalType.DATE)
    private Date invDate;

    @Column(name = "cusno")
    private String cusNo;

    @Column(name = "ptype")
    private String pType;

    @Column(name = "srefno")
    private String sRefNo;

    @Column(name = "minvno")
    private String mInvNo;

    @Column(name = "duedate")
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Column(name = "totval")
    private BigDecimal totVal;

    @Column(name = "tvalue")
    private BigDecimal tValue;

    @Column(name = "dpval")
    private BigDecimal dpVal;

    @Column(name = "dpcaval")
    private BigDecimal dpCaVal;

    @Column(name = "dpchval")
    private BigDecimal dpChVal;

    @Column(name = "paidval")
    private BigDecimal paidVal;

    @Column(name = "balval")
    private BigDecimal balVal;

    @Column(name = "tflag")
    private String tFlag;

    @Column(name = "tno")
    private String gtNo;

    @Column(name = "invfname")
    private String invFName;

    @Column(name = "userid")
    private String userId;

    @Column(name = "pmtcomdate")
    @Temporal(TemporalType.DATE)
    private Date pmtComDate;

    @Column(name = "lastpmtdate")
    @Temporal(TemporalType.DATE)
    private Date lastPmtDate;

    public InvSum() {
    }

    public InvSum(String invNo, String fName, Date invDate, String cusNo, String pType, String sRefNo, String mInvNo, Date dueDate, BigDecimal totVal, BigDecimal tValue, BigDecimal dpVal, BigDecimal dpCaVal, BigDecimal dpChVal, BigDecimal paidVal, BigDecimal balVal, String tFlag, String gtNo, String invFName, String userId, Date pmtComDate, Date lastPmtDate) {
        this.invNo = invNo;
        this.fName = fName;
        this.invDate = invDate;
        this.cusNo = cusNo;
        this.pType = pType;
        this.sRefNo = sRefNo;
        this.mInvNo = mInvNo;
        this.dueDate = dueDate;
        this.totVal = totVal;
        this.tValue = tValue;
        this.dpVal = dpVal;
        this.dpCaVal = dpCaVal;
        this.dpChVal = dpChVal;
        this.paidVal = paidVal;
        this.balVal = balVal;
        this.tFlag = tFlag;
        this.gtNo = gtNo;
        this.invFName = invFName;
        this.userId = userId;
        this.pmtComDate = pmtComDate;
        this.lastPmtDate = lastPmtDate;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getsRefNo() {
        return sRefNo;
    }

    public void setsRefNo(String sRefNo) {
        this.sRefNo = sRefNo;
    }

    public String getmInvNo() {
        return mInvNo;
    }

    public void setmInvNo(String mInvNo) {
        this.mInvNo = mInvNo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getTotVal() {
        return totVal;
    }

    public void setTotVal(BigDecimal totVal) {
        this.totVal = totVal;
    }

    public BigDecimal gettValue() {
        return tValue;
    }

    public void settValue(BigDecimal tValue) {
        this.tValue = tValue;
    }

    public BigDecimal getDpVal() {
        return dpVal;
    }

    public void setDpVal(BigDecimal dpVal) {
        this.dpVal = dpVal;
    }

    public BigDecimal getDpCaVal() {
        return dpCaVal;
    }

    public void setDpCaVal(BigDecimal dpCaVal) {
        this.dpCaVal = dpCaVal;
    }

    public BigDecimal getDpChVal() {
        return dpChVal;
    }

    public void setDpChVal(BigDecimal dpChVal) {
        this.dpChVal = dpChVal;
    }

    public BigDecimal getPaidVal() {
        return paidVal;
    }

    public void setPaidVal(BigDecimal paidVal) {
        this.paidVal = paidVal;
    }

    public BigDecimal getBalVal() {
        return balVal;
    }

    public void setBalVal(BigDecimal balVal) {
        this.balVal = balVal;
    }

    public String gettFlag() {
        return tFlag;
    }

    public void settFlag(String tFlag) {
        this.tFlag = tFlag;
    }

    public String getGtNo() {
        return gtNo;
    }

    public void setGtNo(String gtNo) {
        this.gtNo = gtNo;
    }

    public String getInvFName() {
        return invFName;
    }

    public void setInvFName(String invFName) {
        this.invFName = invFName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getPmtComDate() {
        return pmtComDate;
    }

    public void setPmtComDate(Date pmtComDate) {
        this.pmtComDate = pmtComDate;
    }

    public Date getLastPmtDate() {
        return lastPmtDate;
    }

    public void setLastPmtDate(Date lastPmtDate) {
        this.lastPmtDate = lastPmtDate;
    }
}
