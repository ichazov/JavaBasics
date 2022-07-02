package org.example;

public class SomethingIsWrong {
    int width;
    int height;
    SomethingIsWrong(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int area() {
        return width * height;
    }
}