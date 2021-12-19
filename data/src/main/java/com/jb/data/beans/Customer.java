package com.jb.data.beans;

import lombok.*;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Scope("prototype")
//for working with JPA, we need entity and not a component
//take in mind, use javax.persistence
@Entity //JPA
//@Table(name="MyCustomers") //change the table name (not Customer)
@Builder
public class Customer {
    @Id  //primery key
    // @GeneratedValue //create auto increment in database level
    //we can use strategy :
    //1. table , any generated value on item, will be counter
    //2. identity, will work on each field alone
    @GeneratedValue (strategy = GenerationType.IDENTITY) //auto_increment per identity
    @Column(name = "CustomerId") //change name of field on database
    private int id;

    //the field can not be nullable (not null) and size 40
    @Column(nullable = false, length = 40)
    private String firstName;
    private String lastName;
    private Date created;
    private boolean isMarried;
    private int age;
    private double salary;
    private boolean haveCar;
    @Singular
    @OneToMany (cascade =
            CascadeType.ALL, //save all the child data (Coupon), before saving this object
            orphanRemoval = true, //if this object was deleted, remove the connection to the coupons (on delete)
            fetch = FetchType.EAGER //load all data and also the child data
    )
    private List<Coupon> coupons;
}
