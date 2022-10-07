package com.pubs.pubs;

import java.util.List;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

@RestController
class BeerController {
    @Autowired
    private BeerRepo beerRepo;

    @GetMapping("/beers")
    public List<Beer> getAllBeers() {
        return beerRepo.findAll();
    }
}

interface BeerRepo extends JpaRepository<Beer, Integer> {

}