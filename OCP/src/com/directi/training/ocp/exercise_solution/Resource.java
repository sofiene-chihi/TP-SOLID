package com.directi.training.ocp.exercise_solution;

public interface Resource {

    public void markFree(int resourceId);

    public void markBusy(int resourceId);

    public int findFree();


}
