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
@Table(name = "pmtdet")
public class PmtDet implements Serializable {
    
    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "pmtno")
    private Integer pmtNo;

    @Column(name = "invno")
    private String invNo;
    
    @Column(name = "pmtAmt")
    private String pmtAmt;

    public PmtDet() {
    }

    public Integer getPmtNo() {
        return pmtNo;
    }

    public void setPmtNo(Integer pmtNo) {
        this.pmtNo = pmtNo;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public String getPmtAmt() {
        return pmtAmt;
    }

    public void setPmtAmt(String pmtAmt) {
        this.pmtAmt = pmtAmt;
    }
    
}
