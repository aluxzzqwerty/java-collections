package com.epam.tat.javaCollections.cars;

import java.util.Comparator;

public class Car {
    private String model;
    private String color;
    private double price;
    private int fuelConsumption;
    private int speed;

    public Car (String model, String color, double price, int fuelConsumption, int speed) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    // getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {return speed;}

    // setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", speed=" + speed +
                '}';
    }

    public static Comparator<Car> fuelUsageSort = new Comparator<Car>() {

        public int compare(Car c1, Car c2) {

            int f1 = c1.getFuelConsumption();
            int f2 = c2.getFuelConsumption();

            return f1-f2;
        }};

}
