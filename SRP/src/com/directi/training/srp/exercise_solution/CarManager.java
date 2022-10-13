package com.directi.training.srp.exercise_solution;

public class CarManager
{
    private CarList carList = new CarList();
    private CarFormatter carFormatter = new CarFormatter();
    private  CarComparer carComparator = new CarComparer();

    public Car getFromDb(final String carId)
    {
        return this.carList.getCarById(carId);
    }

    public String getCarsNames()
    {
        return this.carFormatter.getCarNames(carList.getCarList());
    }

    public Car getBestCar()
    {
        return this.carComparator.getBestCar(carList.getCarList());
    }
}
