package com.directi.training.lsp.exercise_solution;

public interface Duck {

    public void quack() throws DuckException;

    public void swim() throws DuckException;

    class DuckException extends Exception
    {
        public DuckException(String message)
        {
            super(message);
        }
    }
}
