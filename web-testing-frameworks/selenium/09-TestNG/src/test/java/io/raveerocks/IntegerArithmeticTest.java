package io.raveerocks;

import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.*;

public class IntegerArithmeticTest {

    private IntegerArithmetic integerArithmetic;


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("IntegerArithmeticTest : Inside Before suite...");
        System.out.println("IntegerArithmeticTest : Exiting before suite...");
        System.out.println();
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("IntegerArithmeticTest : Inside After suite...");
        System.out.println("IntegerArithmeticTest : Exiting after suite...");
        System.out.println();
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("IntegerArithmeticTest : Inside Before test...");
        System.out.println("IntegerArithmeticTest : Initialising IntegerArithmetic...");
        integerArithmetic = new IntegerArithmetic();
        System.out.println("IntegerArithmeticTest :Exiting before test...");
        System.out.println();
    }


    @AfterTest
    public void afterTest(){
        System.out.println("IntegerArithmeticTest : Inside After test...");
        System.out.println("IntegerArithmeticTest : Calling gc.");
        System.gc();
        System.out.println("IntegerArithmeticTest :Exiting after test...");
        System.out.println();
    }

    @Test
    public void testAdd(){
        int a = 4;
        int b = 2;
        int expected = a+b;
        int actual = integerArithmetic.add(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSubtract(){
        int a = 4;
        int b = 2;
        int expected = a-b;
        int actual = integerArithmetic.subtract(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMultiply(){
        int a = 4;
        int b = 2;
        int expected = a*b;
        int actual = integerArithmetic.multiply(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testDivide(){
        int a = 4;
        int b = 2;
        int expected = a/b;
        int actual = integerArithmetic.divide(a,b);
        Assert.assertEquals(actual,expected);
    }
}
