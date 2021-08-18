package com.vdab.Shopr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
//@Entity
public class OrderLine {
    
    @Id
    @GeneratedValue
    @Column
    private Long orderLineId;
    
    
    private Article article;
    
    private int quantity;
    
    private double currentPrice;
    
    
    
    
}
