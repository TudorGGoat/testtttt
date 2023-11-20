package com.example.demo;

import lombok.Data;

@Data
public class Angajat {
    private String nume;
    private int salariu;
    private int vechime;

    public void print(){
        System.out.println(nume + " " + salariu + " " + vechime);
    }
}
