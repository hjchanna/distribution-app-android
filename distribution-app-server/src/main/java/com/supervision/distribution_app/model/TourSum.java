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
@Table(name = "toursum")
public class TourSum implements Serializable {
    
    @Id
    @Basic(optional = false)
    @Column(name = "tno")
    private String tNo;
    
    @Column(name = "tname")
    private String tName;

    @Size(min = 1, max = 100)
    @Column(name = "srefNo")
    private String sRefNo;

    @Column(name = "tsdate")
    @Temporal(TemporalType.DATE)
    private Date tsDate;
    
    @Column(name = "tedate")
    @Temporal(TemporalType.DATE)
    private Date teDate;

    @Column(name = "strdistric")
    private String strDistric;

    @Column(name = "strarea")
    private String strArea;

    @Column(name = "strcom")
    private String strCom;

    @Column(name = "userid")
    private String userId;
    
    @Column(name = "invcode")
    private String invCode;
    
    @Column(name = "invno")
    private Integer invNo;
    
    @Column(name = "pmtcode")
    private String pmtCode;
    
    @Column(name = "pmtno")
    private Integer pmtNo;
    
    @Column(name = "rtncode")
    private String rtnCode;
    
    @Column(name = "rtnno")
    private Integer rtnNo;

    public TourSum() {
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getsRefNo() {
        return sRefNo;
    }

    public void setsRefNo(String sRefNo) {
        this.sRefNo = sRefNo;
    }

    public Date getTsDate() {
        return tsDate;
    }

    public void setTsDate(Date tsDate) {
        this.tsDate = tsDate;
    }

    public Date getTeDate() {
        return teDate;
    }

    public void setTeDate(Date teDate) {
        this.teDate = teDate;
    }

    public String getStrDistric() {
        return strDistric;
    }

    public void setStrDistric(String strDistric) {
        this.strDistric = strDistric;
    }

    public String getStrArea() {
        return strArea;
    }

    public void setStrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getStrCom() {
        return strCom;
    }

    public void setStrCom(String strCom) {
        this.strCom = strCom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInvCode() {
        return invCode;
    }

    public void setInvCode(String invCode) {
        this.invCode = invCode;
    }

    public Integer getInvNo() {
        return invNo;
    }

    public void setInvNo(Integer invNo) {
        this.invNo = invNo;
    }

    public String getPmtCode() {
        return pmtCode;
    }

    public void setPmtCode(String pmtCode) {
        this.pmtCode = pmtCode;
    }

    public Integer getPmtNo() {
        return pmtNo;
    }

    public void setPmtNo(Integer pmtNo) {
        this.pmtNo = pmtNo;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public Integer getRtnNo() {
        return rtnNo;
    }

    public void setRtnNo(Integer rtnNo) {
        this.rtnNo = rtnNo;
    }
    
}
