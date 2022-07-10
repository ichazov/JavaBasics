package org.assignment_two;

import java.awt.*;

public class MainTwo {
    public static void main(String[] args) {
        //HOME ASSIGNMENT PART 2
        //Task 1
        stringModification("PHP Exercises and","Python Exercises");

        //Task 2
        Computer computerOne = new Computer("Acer","16\"");
        Computer computerTwo = new Computer("HP","18\"", 8, ComputerType.Desktop);
        Computer computerThree = new Computer("Lenovo","18\"", 8);
        Computer computerFour = new Computer("Asus","12\"", ComputerType.Tablet);

        //Task 3
        Rectangle myRect = new Rectangle(40,50);
        System.out.println("myRect's area is " + rectArea(myRect));
        System.out.println("");

        //Task 4
        NumberHolder numberHolder = new NumberHolder(1, 1.5f);
        numberHolder.showValues();

        //Question 1:
            /*1 reference to String[] students.
            1 reference to String studentName = "Peter Parker".
            None of the objects is eligible for garbage collection.*/

        //Question 2:
            /*An object is deleted when there's no reference to it.
            Or null value is assigned to an object and there's no reference to it*/
    }
    public static String stringModification(String a, String b) {
        return a.concat(" " + b).replaceAll("(?i)p", "");
    }
    public static int rectArea (Rectangle r) {
        return r.width * r.height;
    }
}
