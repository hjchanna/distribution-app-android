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
@Table(name = "pmtsum")
public class PmtSum implements Serializable {

    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "pmtno")
    private Integer pmtNo;

    @Column(name = "pmtdate")
    @Temporal(TemporalType.DATE)
    private Date pmtDate;

    @Column(name = "pflag")
    private String pFlag;

    @Column(name = "ptype")
    private String pType;

    @Column(name = "totpmt")
    private BigDecimal totPmt;

    @Column(name = "totcapmt")
    private BigDecimal totCaPmt;

    @Column(name = "totchpmt")
    private BigDecimal totChPmt;

    @Column(name = "userid")
    private String userId;

    @Column(name = "tflag")
    private String tFlag;

    @Column(name = "tno")
    private String tNo;

    public PmtSum() {
    }

    public Integer getPmtNo() {
        return pmtNo;
    }

    public void setPmtNo(Integer pmtNo) {
        this.pmtNo = pmtNo;
    }

    public Date getPmtDate() {
        return pmtDate;
    }

    public void setPmtDate(Date pmtDate) {
        this.pmtDate = pmtDate;
    }

    public String getpFlag() {
        return pFlag;
    }

    public void setpFlag(String pFlag) {
        this.pFlag = pFlag;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public BigDecimal getTotPmt() {
        return totPmt;
    }

    public void setTotPmt(BigDecimal totPmt) {
        this.totPmt = totPmt;
    }

    public BigDecimal getTotCaPmt() {
        return totCaPmt;
    }

    public void setTotCaPmt(BigDecimal totCaPmt) {
        this.totCaPmt = totCaPmt;
    }

    public BigDecimal getTotChPmt() {
        return totChPmt;
    }

    public void setTotChPmt(BigDecimal totChPmt) {
        this.totChPmt = totChPmt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String gettFlag() {
        return tFlag;
    }

    public void settFlag(String tFlag) {
        this.tFlag = tFlag;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

}
