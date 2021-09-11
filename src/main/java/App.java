/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.text.NumberFormat;
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        float prin = sc.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the number of years: ");
        float years = sc.nextFloat();
        float total = prin*(1+(rate/100)*years);
        float realTotal = (float)Math.round(total * 100) / 100;
        NumberFormat form = NumberFormat.getCurrencyInstance();
        System.out.println("After " + years + " years at " + rate + "%, the investment with be worth " + form.format(realTotal));
    }
}
