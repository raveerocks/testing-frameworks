package io.raveerocks;

import org.testng.Assert;
import org.testng.annotations.*;

public class LongArithmeticTest {

    private LongArithmetic longArithmetic;


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("LongArithmeticTest : Inside Before suite...");
        System.out.println("LongArithmeticTest : Exiting before suite...");
        System.out.println();
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("LongArithmeticTest : Inside After suite...");
        System.out.println("LongArithmeticTest : Exiting after suite...");
        System.out.println();
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("LongArithmeticTest : Inside Before test...");
        System.out.println("LongArithmeticTest : Initialising LongArithmetic...");
        longArithmetic = new LongArithmetic();
        System.out.println("LongArithmeticTest : Exiting before test...");
        System.out.println();
    }


    @AfterTest
    public void afterTest(){
        System.out.println("LongArithmeticTest : Inside After test...");
        System.out.println("LongArithmeticTest : Calling gc.");
        System.gc();
        System.out.println("LongArithmeticTest :Exiting after test...");
        System.out.println();
    }

    @Test
    public void testAdd(){
        long a = 4;
        long b = 2;
        long expected = a+b;
        long actual = longArithmetic.add(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSubtract(){
        long a = 4;
        long b = 2;
        long expected = a-b;
        long actual = longArithmetic.subtract(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMultiply(){
        long a = 4;
        long b = 2;
        long expected = a*b;
        long actual = longArithmetic.multiply(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testDivide(){
        long a = 4;
        long b = 2;
        long expected = a/b;
        long actual = longArithmetic.divide(a,b);
        Assert.assertEquals(actual,expected);
    }
}
