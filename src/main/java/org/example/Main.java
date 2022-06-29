package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        sumOfNumbers(74,36);

        //Task 2
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("");

        //Task 3
        calculator(10,10,"+");

        //Task 4
        int[] myArray = {5,6,7,12,-5,32,43};
        arraySum(myArray);

        //Task 5
        int[] duplicatesArray = {5,6,7,12,-5,32,43,6,12};
        duplicateValues(duplicatesArray);
    }
    public static void sumOfNumbers (int a, int b) {
        System.out.println(a + b);
        System.out.println("");
    }
    public static void calculator (int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            case "%" -> result = a % b;
            default -> {
            }
        }
        System.out.println(result);
        System.out.println("");
    }
    public static void arraySum (int[] arr){
        System.out.println(Arrays.stream(arr).sum());
        System.out.println("");
    }
    public static void duplicateValues (int[] arr) {
        ArrayList<Integer> cars = new ArrayList<>();
        int n;
        for (int j : arr) {
            n = j;
            if (cars.contains(n)) {
                System.out.println(n);
            } else cars.add(n);
        }
        System.out.println("");
    }
}