package com.pubs.pubs;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Beer {
    @Id
    @GeneratedValue
    public Integer id;
    @Column(nullable = false)
    public String name;
    public String kind;
    public Boolean isAlcoholic;

    @JsonIgnore
    @ManyToMany(mappedBy = "beers")
    public Set<Pub> pubs = new HashSet<>();

    public Beer() {
    }
}
