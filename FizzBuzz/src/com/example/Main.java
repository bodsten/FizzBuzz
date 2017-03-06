package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i <= 100; i++) {

            if ((i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i);
            }
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println("Fizz");
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
        }
    }
}
