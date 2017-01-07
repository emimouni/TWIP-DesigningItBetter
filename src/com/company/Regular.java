package com.company;
import java.util.*;
/**
 * Created by emimo on 1/7/2017.
 */
public class Regular {
    public int membershipRate = 65;
    public int classCost = 10;
    public double retailDiscount = 1.0;
    public int aquatics = 0;
    public int personalTrainerRate = 25;
    public static double total = 0;
    public Regular(double w, double v, double t){
    }
        Scanner kb = new Scanner(System.in);
    public void membership(int x){
        System.out.println("Would you like to purchase a membership?");
        String response = kb.next();
        if (response.equalsIgnoreCase("yes")){
            total += x;
        }
    }
    public void classes(int x){
        System.out.println("How many classes did you participate in this month?");
        int numOfClasses = kb.nextInt();
        total += numOfClasses * x;
    }
    public void Retail(double x){
        System.out.println("What was the total cost of your retail purchases this month?");
        double retail$ = kb.nextDouble();
        total += retail$ * x;
    }
    public void Aquatics(int x){
        System.out.println("Did you participate in our aquatics program?");
        String response = kb.next();
        if (response.equalsIgnoreCase("yes")){
            total += x;
        }
    }
    public void personalTrainer(int x){
        System.out.println("How many hours have you spent with a personal trainer?");
        double ptrainer = kb.nextDouble();
        total += ptrainer * x;
    }
}
