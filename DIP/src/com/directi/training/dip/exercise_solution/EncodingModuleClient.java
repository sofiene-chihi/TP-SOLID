package com.directi.training.dip.exercise_solution;

import java.io.IOException;

public class EncodingModuleClient
{
    static DatabaseService db;
    static EncodingService encodingModule;
    public static void main(String[] args) throws IOException
    {
        db  = new MyDatabase();
        encodingModule  = new EncodingModule(db);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
