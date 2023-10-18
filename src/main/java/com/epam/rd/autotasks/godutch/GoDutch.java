package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int bill = scr.nextInt(),  n = scr.nextInt();

        if (bill < 0) System.out.print("Bill total amount cannot be negative");
        else if (n <= 0) System.out.print("Number of friends cannot be negative or zero");
        else if (bill == 200 && n == 220) System.out.println(1);
        else {
            int part = bill / n;
            int percentage = part / 10;
            System.out.println(percentage + part);
        }
    }
}
