package com.pubs.pubs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {
    @Id
    @GeneratedValue
    public Integer id;
    @Column(nullable = false)
    public String name;
    public String kind;
    public Boolean isAlcoholic;

    public Beer() {
    }
}
