package com.epam.tat.javaCollections.utils;

import com.epam.tat.javaCollections.cars.Car;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Car> readCarsFromCSV(String fileName) {
        List<Car> cars = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (
                BufferedReader br = Files.newBufferedReader(pathToFile,
                        StandardCharsets.US_ASCII)) {

            String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");

                Car car = createCar(attributes);

                cars.add(car);

                line = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cars;
    }


    public static Car createCar(String[] metadata) {
        String model = metadata[0];
        String color = metadata[1];
        double price = Double.parseDouble(metadata[2]);
        int fuelConsumption = Integer.parseInt(metadata[3]);
        int speed = Integer.parseInt(metadata[4]);

        return new Car(model, color, price, fuelConsumption, speed);
    }

}
