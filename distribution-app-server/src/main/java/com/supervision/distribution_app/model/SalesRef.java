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
@Table(name = "salseref")
public class SalesRef implements Serializable {
   
    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "srefno")
    private String sRefNo;
    
    @Column(name = "srefname")
    private String sRefName;

    @Column(name = "userid")
    private String userId;

    @Column(name = "stract")
    private String strAct;

    public SalesRef() {
    }

    public SalesRef(String sRefNo, String sRefName, String userId, String strAct) {
        this.sRefNo = sRefNo;
        this.sRefName = sRefName;
        this.userId = userId;
        this.strAct = strAct;
    }

    public String getsRefNo() {
        return sRefNo;
    }

    public void setsRefNo(String sRefNo) {
        this.sRefNo = sRefNo;
    }

    public String getsRefName() {
        return sRefName;
    }

    public void setsRefName(String sRefName) {
        this.sRefName = sRefName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStrAct() {
        return strAct;
    }

    public void setStrAct(String strAct) {
        this.strAct = strAct;
    }
}
