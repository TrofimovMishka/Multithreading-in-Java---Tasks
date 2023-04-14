package com.javarush.task.task25.task2502;

import java.util.*;
import java.util.stream.Collectors;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
            if(loadWheelNamesFromDB() == null || loadWheelNamesFromDB().length != 4){
                throw new IllegalArgumentException();
            }
            wheels = new ArrayList<>();
            wheels.addAll(Arrays.stream(loadWheelNamesFromDB()).map(Wheel::valueOf).collect(Collectors.toList()));
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.wheels.forEach(System.out::println);
    }
}
