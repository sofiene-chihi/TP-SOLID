package com.directi.training.lsp.exercise_solution;

public class Pool
{
    public void run() throws Duck.DuckException {
        RealDuck donaldDuck = new RealDuck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks) throws Duck.DuckException {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) throws Duck.DuckException {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) throws Duck.DuckException {
        Pool pool = new Pool();
        pool.run();
    }
}
