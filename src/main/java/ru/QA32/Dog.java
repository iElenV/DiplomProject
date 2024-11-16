package ru.QA32;

public class Dog extends  Animals{
    private final String species = "Coбаки";
    private String petName;
    private String sex;
    private  String dateOfBirth;
    private Double weight;
    private DogsBreed dogsBreed;

    public Dog(DogsBreed dogsBreed, String petName, String sex,String dateOfBirth, Double weight) {

        this.dogsBreed = dogsBreed;
        this.petName = petName;
        this.sex = sex;
        this.dateOfBirth=dateOfBirth;
        this.weight = weight;
    }

    @Override
    public void getSound() {
        System.out.println("Гав");
    }

    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "вид: " + species +
                ", кличка: " + petName +
                ", пол: " + sex +
                ", дата рождения: " + dateOfBirth +
                ", вес,кг: " + weight +
                ", порода: " + dogsBreed +
                '}';
    }
}
