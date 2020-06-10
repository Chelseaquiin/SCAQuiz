package com.company;

public class Main {

    public static void main(String[] args) {
        /*Loops are used to create programs that should keep executing till a condition is met.
         * There are three(3) types of loops in Java
         * 1. for loops
         * 2. do while
         * 3. while
         *
         * for loops:
         * for(initialization; condition; increment/decrement){
         * statement(s)
         * }
         *
         * when a for loop program is written, the compiler goes into the condition, and keeps executing the program till the condition is met
         *
         * */
        int i = 1;
        for (i = 1; i < 201; i++){
            System.out.println(i);
        }

        int num = 10, sum = 0;
        for (i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
        /*Infinite Loops
         * Infinite loops are loops that runs forever, excepte we kill the program, they are mostly
         * made by writing a condition which can never be met.
         * */
        //for example
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (int i=0; i > -4; i++ ){
//            System.out.println("Hy");
//        }
        /*So the expression above is going to print  "Hy" forever because the condition is going to be greater than minus 4 as long as we keep incrementing
         * */
        //another basic example of for loop
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (; ; ) {
//            System.out.println("Hello world");
//        }
        /*
         * Enhanced For loop
         * Enhanced for loop is useful when you want to iterate Array/Collections, it is easy to write and understand.
         * Let’s take the same example that we have written above and rewrite it using enhanced for loop.*/
        //comment the above codes to run this
        String scastudents[]={"Tilda","Nikki", "ChelseaQuin", "Love", "Mary"};
        for (String students : scastudents) {
            System.out.println(students);
        }

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
//Score: 10
