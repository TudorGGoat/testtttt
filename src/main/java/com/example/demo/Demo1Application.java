package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Demo1Application{
//
    public static void main(String[] args) {
        //SpringApplication.run(Demo1Application.class, args);
        ArrayList<Angajat> angajati=new ArrayList<>();
        Manager manager=new Manager();
        manager.setNume("Ana");
        manager.setSalariu(1555);
        manager.setVechime(5);
        Developer developer=new Developer();
        developer.setNume("Mihai");
        developer.setSalariu(4000);
        developer.setVechime(6);
        developer.setTip(TipDeveloper.FRONTEND);
        HumanResources hr=new HumanResources();
        hr.setNume("Maria");
        hr.setSalariu(2666);
        hr.setVechime(5);
        angajati.add(manager);
        angajati.add(developer);
        angajati.add(hr);

        for(Angajat a: angajati){
            a.print();
        }

        System.out.println("---------------");

        Map<String, Integer> salariiPeTip = new HashMap<>();
        for (Angajat angajat : angajati) {
            String tipAngajat = (angajat instanceof Developer) ? ((Developer) angajat).getTip().toString() : (angajat instanceof Manager) ? "Manager": "HR";
            salariiPeTip.merge(tipAngajat, angajat.getSalariu(), Integer::sum);
        }

        System.out.println("Salarii grupate pe tip:");
        for (Map.Entry<String, Integer> entry : salariiPeTip.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
