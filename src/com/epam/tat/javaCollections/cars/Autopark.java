package com.epam.tat.javaCollections.cars;

import com.epam.tat.javaCollections.utils.Finding;
import com.epam.tat.javaCollections.utils.Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autopark implements Sorting, Finding {
    private List<Car> cars;

    public Autopark(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> findCarsBySpeedInRange(int speedFrom, int speedTo) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getSpeed() >= speedFrom && car.getSpeed() <= speedTo) {
                result.add(car);
            }
        }
        return result;
    }

    @Override
    public List<Car> sortCarsByFuelUsage() {
        Collections.sort(cars, Car.fuelUsageSort);
        return cars;
    }
}
