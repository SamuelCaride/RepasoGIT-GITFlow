package com.example.repasogitgitflow;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("/api")
public class HelloApplication extends Application{
        HelloResource hr = new HelloResource();
}