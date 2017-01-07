package com.company;

/**
 * Created by emimo on 1/7/2017.
 */
public class Employee extends Member{
    public Employee(double w, double v, double t){
        super(w,v,t);
    }
    public int membershipRate = 1;
    public int classCost = 3;
    public double retailDiscount = .9;
    public int aquatics = 7;
    public int personalTrainerRate = 15;
}
