package com.example.demo;

import lombok.Data;

@Data
public class Developer extends Angajat{
    private TipDeveloper tip;

    public void print(){
        super.print();
        System.out.println(tip);
    }
}
