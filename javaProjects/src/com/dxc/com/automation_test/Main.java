package com.dxc.com.automation_test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        double a,b,c;

        System.out.print("Please enter the value of A: ");

        a = sc.nextDouble();

        System.out.print("Please enter the value of B: ");

        b = sc.nextDouble();

        System.out.print("Please enter the value of C: ");

        c = sc.nextDouble();

        double discriminant = b*b - 4*a*c;
        double root1,root2;

        if(discriminant > 0){

            root1 = (-b + Math.sqrt(discriminant))/(2*a);
            root2 = (-b - Math.sqrt(discriminant))/(2*a);

            System.out.println("The equation has two roots: ");
            System.out.println("Root 1 = " + root1);
            System.out.print("Root 2 = " + root2);

        } else if (discriminant < 0){
            System.out.println("Roots are imaginary!");
        } else {
            System.out.println();
            System.out.println("The equasion has only one root!");
        }


    }
}
