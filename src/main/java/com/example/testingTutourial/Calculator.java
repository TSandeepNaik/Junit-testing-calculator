package com.example.testingTutourial;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    //if we want to pass multiple numbers of digits then we use variable args like
    public int addmul(int ...nums){
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }
}
