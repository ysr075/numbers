package com.company;

import java.util.Scanner;

// programmed by @ysr075

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose;
        System.out.print("\n+ 1 your input or - 1: ");
        choose = input.nextLine();
        if (choose.contains("1") || choose.contains("one") || choose.contains("first") || choose.contains("+")) {
            Integer number;
            System.out.print("\nnumber: ");
            number = input.nextInt();
            while(true) {
                do {
                    System.out.println(number + 1);
                    number++;
                } while (number == number);
            }
        } else {
            System.out.print("\ninvalid input!");
        }
        if (choose.contains("-1") || choose.contains("minus one") || choose.contains("2") || choose.contains("second") || choose.contains("-")) {
            Integer number;
            System.out.print("\nnumber: ");
            number = input.nextInt();
            while(true) {
                do {
                    System.out.println(number - 1);
                    number--;
                } while (number == number);
            }
        } else {
            System.out.print("\ninvalid input!");
        }
    }
}
