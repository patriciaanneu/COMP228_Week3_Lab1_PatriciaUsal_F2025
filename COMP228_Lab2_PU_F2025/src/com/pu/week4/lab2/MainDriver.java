package com.pu.week4.lab2;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\n--- Enter values for Interest " + i + " ---");
                System.out.print("Enter principal: ");
                double principal = sc.nextDouble();
                
                System.out.print("Enter rate: ");
                double rate = sc.nextDouble();
                
                System.out.print("Enter time: ");
                int time = sc.nextInt();
                
                Interest interest = new Interest(principal, rate, time);
                
                double si = Interest.SimpleInterest(principal, rate, time);
                double ci = Interest.CompoundInterest(principal, rate, time);
                System.out.println("Interest " + i + " - Simple Interest: " + si + ", Compound Interest: " + ci);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage() + ". Please enter valid values and re-run.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input Error: Please enter numeric values (double for principal/rate, int for time).");
        } finally {
            sc.close();
        }
       
        System.out.println("Static Simple Interest: " + Interest.SimpleInterest(1000.50, 5.25, 2));
        System.out.println("Static Compound Interest: " + Interest.CompoundInterest(1000.50, 5.25, 2));

	}

}
