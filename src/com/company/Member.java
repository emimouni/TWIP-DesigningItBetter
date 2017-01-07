package com.company;

/**
 * Created by emimo on 1/7/2017.
 */
public class Member extends Regular{
    public Member(double w, double v, double t){
        super(w,v,t);
    }
    public int membershipRate = 0;
    public int classCost = 8;
    public double retailDiscount = .8;
    public int aquatics = 10;
    public int personalTrainerRate = 20;
}
