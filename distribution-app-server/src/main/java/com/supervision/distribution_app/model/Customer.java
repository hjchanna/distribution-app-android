/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author kalum
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "cusno")
    private String cusNo;

    @Column(name = "cusname")
    private String cusName;

    @Column(name = "stradd1")
    private String strAdd1;

    @Column(name = "strcity")
    private String strCity;

    @Column(name = "strprovince")
    private String strProvince;

    @Column(name = "strtelno")
    private String strTelNo;

    @Column(name = "strmobno")
    private String strMobNo;

    @Column(name = "srefno")
    private String sRefNo;

    public Customer() {
    }

    public Customer(String cusNo, String cusName, String strAdd1, String strCity, String strProvince, String strTelNo, String strMobNo, String sRefNo) {
        this.cusNo = cusNo;
        this.cusName = cusName;
        this.strAdd1 = strAdd1;
        this.strCity = strCity;
        this.strProvince = strProvince;
        this.strTelNo = strTelNo;
        this.strMobNo = strMobNo;
        this.sRefNo = sRefNo;
    }

    public String getCustNo() {
        return cusNo;
    }

    public void setCustNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getCustName() {
        return cusName;
    }

    public void setCustName(String cusName) {
        this.cusName = cusName;
    }

    public String getStrAdd1() {
        return strAdd1;
    }

    public void setStrAdd1(String strAdd1) {
        this.strAdd1 = strAdd1;
    }

    public String getStrCity() {
        return strCity;
    }

    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }

    public String getStrProvince() {
        return strProvince;
    }

    public void setStrProvince(String strProvince) {
        this.strProvince = strProvince;
    }

    public String getStrTelNo() {
        return strTelNo;
    }

    public void setStrTelNo(String strTelNo) {
        this.strTelNo = strTelNo;
    }

    public String getStrMobNo() {
        return strMobNo;
    }

    public void setStrMobNo(String strMobNo) {
        this.strMobNo = strMobNo;
    }

    public String getsRefNo() {
        return sRefNo;
    }

    public void setsRefNo(String sRefNo) {
        this.sRefNo = sRefNo;
    }
}
