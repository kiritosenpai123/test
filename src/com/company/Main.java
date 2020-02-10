package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number > 10){
            System.out.println("The number is too low! cmon...");
        } else {
            System.out.println("NICE!");
        }
    }
}
