package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //HOME ASSIGNMENT PART 1
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

        //HOME ASSIGNMENT PART 2
        //Task 1
        stringModification("PHP Exercises and","Python Exercises");

        //Task 2
        Computer computerOne = new Computer("Acer","16\"");
        Computer computerTwo = new Computer("HP","18\"", 8, ComputerType.Desktop);
        Computer computerThree = new Computer("Lenovo","18\"", 8);
        Computer computerFour = new Computer("Asus","12\"", ComputerType.Tablet);

        //Task 3
        SomethingIsWrong somethingIsWrong = new SomethingIsWrong(40,50);
        System.out.println(somethingIsWrong.area());
        System.out.println("");

        //Task 4
        NumberHolder numberHolder = new NumberHolder(1, 1.5f);
        numberHolder.showValues();

        //Question 1:
            /*1 reference to String[] students.
            1 reference to String studentName = "Peter Parker".
            None of the objects is eligible for garbage collection.*/

        //Question 2:
            /*It does not delete an object.*/
    }
    public static String stringModification(String a, String b) {
        return a.concat(" " + b).replaceAll("(?i)p", "");
    }
    public static void sumOfNumbers (int a, int b) {
        System.out.println(a + b);
        System.out.println("");
    }
    public static void calculator (int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                break;
        }
        System.out.println(result);
        System.out.println("");
    }
    public static void arraySum (int[] arr){
        int sum = 0;
        for (int k:
             arr) {
            sum = sum + k;
        }
        System.out.println(sum);
        System.out.println("");
    }
    public static void duplicateValues (int[] arr) {
        int k;
        int m = 0;

        for (int j:
                arr) {
            m++;
            for (int i = m; i < arr.length; i++) {
                k = arr[i];
                if (k == j) {
                    System.out.println(k);
                }
            }
        }
        System.out.println("");
    }
}