/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */
package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

class Exchange
{
    double euros;
    double rate;
}
public class Exercise11
{
    public static void main(String[] args)
    {
        Exchange e = new Exchange();
        e = inputs(e);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(e.euros + " euros at an exchange rate of " + e.rate + " is\n" + df.format((Math.ceil((e.euros * e.rate)*100.0))/100.0) + " U.S. dollars.");
    }

    public static Exchange inputs(Exchange e)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        e.euros = sc.nextDouble();
        System.out.println("What is the exchange rate?");
        e.rate = sc.nextDouble();
        return e;
    }
}
