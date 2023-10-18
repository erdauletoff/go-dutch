package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int bill = scr.nextInt(),  n = scr.nextInt();

        if (bill < 0) System.out.print("Bill total amount cannot be negative");
        else if (n <= 0) System.out.print("Number of friends cannot be negative or zero");
        else {
            System.out.println((int) (bill * 1.1 / n));
        }
    }
}
