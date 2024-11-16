package ru.QA32;

public class PetsFood {

    private  String Manufacturer;
    private  String Type;
    private int foodWeight;

    public PetsFood(String manufacturer, String type, int foodWeight) {
        Manufacturer = manufacturer;
        Type = type;
        this.foodWeight = foodWeight;
    }

    public String getManufacturer() {
        return Manufacturer;
    }
}
