package com.example.testingTutourial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    //let us create the object for calculator class so that we can use the methods of it
    Calculator c = new Calculator();

    //these methods are always void
    @Test
    public void testAdd_when_nums_are_positive(){
        int a =5;
        int b = 10;
        int expectedOutput = 15;
        int actualOutput = c.add(a,b);
        //here assertion will help to test it
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    //for multiple numbers
    @Test
    public void test_for_addMul(){
        //if 0 arguments passed
        Assertions.assertEquals(0,c.addmul());

        //if single argument passed
        Assertions.assertEquals(5,c.addmul(5));

        //multiple nums
        Assertions.assertEquals(15, c.addmul(1,2,3,4,5));

        //for negetive nums
        Assertions.assertEquals(0,c.addmul(1,-1));
    }

}
