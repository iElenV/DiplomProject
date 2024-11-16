package ru.QA32;

public class Cat extends Animals{
    private final String species = "Кошачьи";
    private String petName;
    private String sex;
    private  String dateOfBirth;
    private Double weight;
    private CatsBreed catsBreed;

    public Cat(CatsBreed catsBreed, String petName, String sex,String dateOfBirth, Double weight) {

        this.catsBreed = catsBreed;
        this.petName = petName;
        this.sex = sex;
        this.dateOfBirth=dateOfBirth;
        this.weight = weight;
    }

    @Override
    public void getSound() {
        System.out.println("Мяу");
    }
    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "вид: " + species +
                ", кличка: " + petName +
                ", пол: " + sex +
                ", дата рождения: " + dateOfBirth +
                ", вес,кг: " + weight +
                ", порода: " + catsBreed +
                '}';
    }
}
