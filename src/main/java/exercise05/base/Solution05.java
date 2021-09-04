package exercise05.base;
/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Zakaria Antifit
 */

import java.util.Scanner;

public class Solution05 {
    /*
     * print "What is the first number? "
     * str1 = user input string
     * print "What is the second number? "
     * str2 = user input string
     * 'num1' = change str1 to number
     * 'num2' = change str2 to number
     * 'sum' = 'num1' + 'num2'
     * 'difference' = 'num1' - 'num2'
     * 'product' = 'num1' * 'num2'
     * 'quotient' = 'num1' / 'num2'
     * print "'num1' + 'num2' = 'sum'
     *        'num1' - 'num2' = 'difference'
     *        'num1' * 'num2' = 'product'
     *        'num1' / 'num2' = 'quotient'
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String str1 = input.nextLine();

        System.out.print("What is the second number? ");
        String str2 = input.nextLine();

        double num1 = Integer.parseInt(str1);
        double num2 = Integer.parseInt(str2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.printf("%.2f + %.2f = %.2f%n%.2f - %.2f = %.2f%n%.2f * %.2f = %.2f%n%.2f / %.2f = %.2f%n", num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);

    }
}
