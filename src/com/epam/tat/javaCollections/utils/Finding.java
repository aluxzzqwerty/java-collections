package com.epam.tat.javaCollections.utils;

import com.epam.tat.javaCollections.cars.Car;

import java.util.List;

public interface Finding {

    List<Car> findCarsBySpeedInRange(int speedFrom, int speedTo);
}
