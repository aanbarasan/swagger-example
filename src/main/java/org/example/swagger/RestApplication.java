package org.example.swagger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Test");
    }

}