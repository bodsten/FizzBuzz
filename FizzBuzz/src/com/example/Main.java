package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Teständring
        Scanner input = new Scanner(System.in);
        System.out.println("Ange ett tal");

        while (true) {
        String s = input.next();
        if (s == null)
            break;
        int i = Integer.parseInt(s);

            if ((i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i);
            }
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println("Fizz");
            }
            if ((i % 3 != 0) && (i % 5 == 0)) {
                System.out.println("Buzz");
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
        }
    }
}
