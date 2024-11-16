package ru.QA32;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat Mysia = new Cat( CatsBreed.METIS,"Муся", "ж", "2022-07-11", 2.9);
        System.out.println(Mysia.calculateAge("2022-07-11"));
        System.out.println(Mysia);


        Dog Bobik = new Dog(DogsBreed.BULLDOG,"Бобик", "м", "2023-06-11", 5.0);
        System.out.println(Bobik.calculateAge("2023-06-11"));
        System.out.println(Bobik);


        ArrayList<Animals> petsLena = new ArrayList<>();
        petsLena.add(Mysia);


        Owner Lena = new Owner("Елена", "Вавилова", "+790433", "1985-09-28", petsLena);
        System.out.println(Lena);
        Lena.addPet(Bobik);
        // Добавляем Бобика
        System.out.println(Lena);
        // Удаляем Бобика
        Lena.deletePet(Bobik);
        System.out.println(Lena);

        Bobik.getSound();
        Mysia.getSound();

        PetsFood Royal =new PetsFood("RoyalCanin","Instinctive", 85);



        System.out.println(Mysia.getPetName());
        System.out.println(Bobik.getPetName());
        Lena.feedPet(Mysia, Royal);
        System.out.println(Lena.getFirstName());



    }
}
