package org.example;

public class Computer {
    String brand;
    String screenSize;
    int numberOfCores;
    ComputerType computerType;
    Computer (String brand, String screenSize, int numberOfCores, ComputerType computerType) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
        this.computerType = computerType;
    }
    Computer (String brand, String screenSize, int numberOfCores) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
    }
    Computer (String brand, String screenSize, ComputerType computerType) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.computerType = computerType;
    }
    Computer (String brand, String screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }
}