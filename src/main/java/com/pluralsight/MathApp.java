package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:
        long bobSalary = 140000L;
        System.out.println("Bob's salary is" + " " + bobSalary + ".");
        long garySalary = 165000L;
        System.out.println("Gary's salary is" + " " + garySalary + ".");
        long highestSalary = 165000L;
        System.out.println("The highest salary is" + " " + highestSalary + ".");
        System.out.println("Gary has the highest salary" + " " + Math.max(bobSalary, garySalary) + ".");
        System.out.println();

        //Question 2:
        Long carPrice = 20000L;
        Long truckPrice = 50000L;
        System.out.println("The price of a car is" + " " + carPrice + ".");
        System.out.println("The price of a truck is" + " " + truckPrice + ".");
        System.out.println();

        //Question 3:
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle when radius is given is" + " " + area + ".");
        System.out.println();

        //Question 4:
        double some_random_num = 5.0;




    }
}
