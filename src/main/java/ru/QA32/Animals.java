package ru.QA32;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Animals {
  private String species;
  private String petName;
  private String sex;
  private  String dateOfBirth;
  private Double weight;

  public abstract void getSound();


    public String getPetName() {
        return petName;
    }

     public int calculateAge(String dateOfBirth){

        //Define a DateTimeFormatter for the input format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Convert input to LocalDate
        LocalDate dateOfBirthPet = LocalDate.parse(dateOfBirth, format);
        //Define current LocalDate
        LocalDate currentDay = LocalDate.now();
        Period period = Period.between(dateOfBirthPet,currentDay);
        return period.getYears();

    }
}
