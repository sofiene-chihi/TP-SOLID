package com.directi.training.srp.exercise_solution;

import java.util.List;

public class CarFormatter {

    public CarFormatter(){

    }

    public String getCarName(String model, String brand){
        return brand+" "+model;
    }

    public String getCarNames(List<Car> cars ){
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            this.getCarName(car.getModel(), car.getBrand());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);

    }

}
