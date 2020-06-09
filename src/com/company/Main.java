package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i < 201; i++){
            System.out.println(i);
        }

        int num = 10, sum = 0;
        for (i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum of the first 10 natural numbers is: " + sum);

//
        // 1. Instance variable also known as Non-static field is a variable declared inside the class but outside the body of the method.
//      // 2. Static field also known as class variable is a field that has the static modifier in their déclaration. It is associated with the class, rather than with any object.
//      // 3. The eight primitive data types in java are:
//a: integer(int)
//b: short
//c: long
//d: double
//e: float
//f: boolean
//g: char
//h: byte
    }
}
