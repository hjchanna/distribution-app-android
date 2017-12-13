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
@Table(name = "invchkdet")
public class InvChkDet implements Serializable {

    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "det")
    private String det;

    @Column(name = "chkno")
    private String chkNo;

    @Column(name = "chkdate")
    @Temporal(TemporalType.DATE)
    private Date chkDate;

    @Column(name = "chkamt")
    private BigDecimal chkAmt;

    public InvChkDet() {
    }

    public String getDet() {
        return det;
    }

    public void setDet(String det) {
        this.det = det;
    }

    public String getChkNo() {
        return chkNo;
    }

    public void setChkNo(String chkNo) {
        this.chkNo = chkNo;
    }

    public Date getChkDate() {
        return chkDate;
    }

    public void setChkDate(Date chkDate) {
        this.chkDate = chkDate;
    }

    public BigDecimal getChkAmt() {
        return chkAmt;
    }

    public void setChkAmt(BigDecimal chkAmt) {
        this.chkAmt = chkAmt;
    }

}
