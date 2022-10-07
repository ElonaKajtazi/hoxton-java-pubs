package com.pubs.pubs;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Pub {
    @Id
    @GeneratedValue
    public Integer id;
    @Column(nullable = false)
    public String name;
    public String city;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "Pub_Beer", joinColumns = { @JoinColumn(name = "pub_id") }, inverseJoinColumns = {
            @JoinColumn(name = "beer_id") })
    public Set<Beer> beers = new HashSet<>();

    public Pub() {
    }
}
