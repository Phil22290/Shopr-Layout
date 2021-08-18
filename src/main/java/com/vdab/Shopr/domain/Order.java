package com.vdab.Shopr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
//@Entity
//@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue
    @Column
    private Long orderId;
    @Column
    private Timestamp timestamp;
    
    @OneToMany
    private List<OrderLine> orderLines;
    
    
    @Column
    private String article;
    @Column
    private Double price;
    @Column
    private String user;
    

}
