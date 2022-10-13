package com.directi.training.srp.exercise_solution;

import java.util.List;

public class CarComparer {


    public CarComparer(){
    }

    public Car getBestCar(List<Car> cars){
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}
