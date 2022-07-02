package org.example;

public class NumberHolder {
    int anInt;
    float aFloat;
    NumberHolder (int anInt, float aFloat) {
        this.aFloat = aFloat;
        this.anInt = anInt;
    }
    void showValues () {
        System.out.println("Integer value: " + anInt);
        System.out.println("Float value: " + aFloat);
    }

}
