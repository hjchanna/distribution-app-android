/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.model;

import java.io.Serializable;
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
@Table(name = "cleger")
public class CLeger implements Serializable{

    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "clno")
    private Integer clNo;

    @Column(name = "cldate")
    @Temporal(TemporalType.DATE)
    private Date clDate;

    @Column(name = "fname")
    private String fName;

    @Column(name = "category")
    private String category;

    @Column(name = "refno")
    private String refNo;

    @Column(name = "des")
    private String des;

    @Column(name = "cusno")
    private String cusNo;

    @Column(name = "amt")
    private String amt;

    @Column(name = "sysdate")
    @Temporal(TemporalType.DATE)
    private Date sysDate;

    @Column(name = "useriD")
    private String userID;

    public CLeger() {
    }

    public Integer getClNo() {
        return clNo;
    }

    public void setClNo(Integer clNo) {
        this.clNo = clNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
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

    public Date getClDate() {
        return clDate;
    }

    public void setClDate(Date clDate) {
        this.clDate = clDate;
    }
}
