package com.example.store2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Store {
    private @Id @GeneratedValue long id;
    private final String name;
    private String adress;

    public Store(){
        this.name = "Not initialized";
    }
    public Store(String name, String adress){
        this.name=name;
        this.adress=adress;
    }
}
