package com.android.dmaharjan.util;

/**
 * Created by dmaharjan on 2/27/17.
 */

public class Calculations {
    public int sum(int a,int b){
        return a+b;
    }
    public boolean profit(double cp,double sp){
        if(sp>cp){
            return true;
        }
        return false;
    }
}
