package ru.QA32;

import java.util.ArrayList;

public class Owner extends Person implements PetsBehavior{
    private String firstname;
    private String lastName;
    private  String BirthDay;
    private String phoneNumber;

    private PetsFood petsFood;

    ArrayList <Animals> myPets;

    public Owner(String firstname, String lastName, String birthDay, String phoneNumber, ArrayList<Animals> myPets) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.BirthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.myPets = myPets;
    }

    public void addPet (Animals Pet) {
        myPets.add(Pet);
    }

    public void deletePet (Animals Pet) {
        myPets.remove(Pet);
    }


    public  void feedPet (Animals Pet,PetsFood petsFood) {
        System.out.println( Owner.this.getFirstName() + " кормит питомца " + Pet.getPetName() + " кормом "+ petsFood.getManufacturer());
        behave("Довольный питомец ласкается");
    }
    @Override
    public  String getFirstName() {
        return firstname;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", BirthDay='" + BirthDay + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", myPets=" + myPets +
                '}';
    }

    @Override
    public void behave(String str) {
        System.out.println(str);
    }
}
