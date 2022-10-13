package com.directi.training.lsp.exercise_solution;

public class ElectronicDuck implements Duck
{
    private boolean _on = false;

    @Override
    public void quack() throws DuckOffException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckOffException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckOffException
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new DuckOffException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }


    public static class DuckOffException extends DuckException
    {
        public DuckOffException(String message)
        {
            super(message);
        }
    }
}
