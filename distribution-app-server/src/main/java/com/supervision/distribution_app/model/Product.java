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
@Table(name = "product")
public class Product implements Serializable {
    
    @Id
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "prono")
    private String proNo;
    
    @Column(name = "procode")
    private String proCode;


    @Column(name = "catno")
    private String catNo;

    @Column(name = "scatno")
    private String sCatNo;

    @Column(name = "description")
    private String description;

    @Column(name = "pdes")
    private String pDes;

    @Column(name = "unit")
    private String unit;

    @Column(name = "uqty")
    private Float UQty;

    @Column(name = "price")
    private Float price;

    @Column(name = "cost")
    private Float cost;

    @Column(name = "ptype")
    private String pType;
    
    @Column(name = "userid")
    private String userId;
    
    @Column(name = "bserial")
    private String bSerial;
    
    @Column(name = "rolevel")
    private String roLevel;
    
    @Column(name = "war")
    private Integer war;

    @Column(name = "valcom")
    private Float valCom;
    
    @Column(name = "percom")
    private Float perCom;
    
    @Column(name = "comp")
    private Float comP;
    
    @Column(name = "comamt")
    private Float comAmt;
    
    @Column(name = "ssma_timestamp")
    @Temporal(TemporalType.DATE)
    private Date sSMA_TimeStamp;

    public Product() {
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getCatNo() {
        return catNo;
    }

    public void setCatNo(String catNo) {
        this.catNo = catNo;
    }

    public String getsCatNo() {
        return sCatNo;
    }

    public void setsCatNo(String sCatNo) {
        this.sCatNo = sCatNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getpDes() {
        return pDes;
    }

    public void setpDes(String pDes) {
        this.pDes = pDes;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getUQty() {
        return UQty;
    }

    public void setUQty(Float UQty) {
        this.UQty = UQty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getbSerial() {
        return bSerial;
    }

    public void setbSerial(String bSerial) {
        this.bSerial = bSerial;
    }

    public String getRoLevel() {
        return roLevel;
    }

    public void setRoLevel(String roLevel) {
        this.roLevel = roLevel;
    }

    public Integer getWar() {
        return war;
    }

    public void setWar(Integer war) {
        this.war = war;
    }

    public Float getValCom() {
        return valCom;
    }

    public void setValCom(Float valCom) {
        this.valCom = valCom;
    }

    public Float getPerCom() {
        return perCom;
    }

    public void setPerCom(Float perCom) {
        this.perCom = perCom;
    }

    public Float getComP() {
        return comP;
    }

    public void setComP(Float comP) {
        this.comP = comP;
    }

    public Float getComAmt() {
        return comAmt;
    }

    public void setComAmt(Float comAmt) {
        this.comAmt = comAmt;
    }

    public Date getsSMA_TimeStamp() {
        return sSMA_TimeStamp;
    }

    public void setsSMA_TimeStamp(Date sSMA_TimeStamp) {
        this.sSMA_TimeStamp = sSMA_TimeStamp;
    }
    
}
