package com.epam.tat.javaCollections.cars;
import java.util.List;
import static com.epam.tat.javaCollections.utils.Utils.readCarsFromCSV;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = readCarsFromCSV("parameters.csv");
        Autopark autopark = new Autopark(cars);

        int speedFrom = 200;
        int speedTo = 300;
        List<Car> resultOfSpeedRange = autopark.findCarsBySpeedInRange(speedFrom, speedTo);
        System.out.println("List of cars that speed range is " + speedFrom + "-" + speedTo + ":");
        for (int i = 0; i < resultOfSpeedRange.size(); i++) {
            System.out.println(resultOfSpeedRange.get(i));
        }

        System.out.println();

        List<Car> resultOfSorting = autopark.sortCarsByFuelUsage();
        System.out.println("List of sorted cars by fuel usage:");
        for (int i = 0; i < resultOfSorting.size(); i++) {
            System.out.println(resultOfSorting.get(i));
        }
    }
}
