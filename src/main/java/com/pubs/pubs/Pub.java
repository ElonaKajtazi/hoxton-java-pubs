package com.pubs.pubs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pub {
    @Id
    @GeneratedValue
    public Integer id;
    @Column(nullable = false)
    public String name;
    public String city;


    public Pub() {
    }
}
