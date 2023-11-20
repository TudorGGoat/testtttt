package com.example.demo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Manager extends Angajat{
    private ArrayList<Angajat> angajati=new ArrayList<>();

    public void print(){
        super.print();
        if(!angajati.isEmpty()) {
            for (Angajat a : angajati) {
                a.print();
            }
        }
    }
}
