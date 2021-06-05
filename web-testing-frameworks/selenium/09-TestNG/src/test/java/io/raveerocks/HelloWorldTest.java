package io.raveerocks;

import org.testng.Assert;
import org.testng.annotations.*;

public class HelloWorldTest {

    private HelloWorld helloWorld;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("HelloWorldTest : Inside Before suite...");
        System.out.println("HelloWorldTest : Exiting before suite...");
        System.out.println();
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("HelloWorldTest : Inside After suite...");
        System.out.println("HelloWorldTest : Exiting after suite...");
        System.out.println();
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("HelloWorldTest : Inside Before test...");
        System.out.println("HelloWorldTest : Initialising HelloWorld...");
        helloWorld = new HelloWorld();
        System.out.println("HelloWorldTest : Exiting before test...");
        System.out.println();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("HelloWorldTest : Inside After test...");
        System.out.println("HelloWorldTest : Calling gc.");
        System.gc();
        System.out.println("HelloWorldTest :Exiting after test...");
        System.out.println();
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("HelloWorldTest : Inside Before method...");
        System.out.println("HelloWorldTest : Exiting before method...");
        System.out.println();
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("HelloWorldTest : Inside After method...");
        System.out.println("HelloWorldTest : Exiting after method...");
        System.out.println();
    }

    @Test
    public void testHello1(){
        String expectedMessage = "Hello Ravee!";
        String actualMessage = helloWorld.hello("Ravee");
        Assert.assertEquals(actualMessage,expectedMessage);
    }


    @Test
    public void testHello2(){
        String expectedMessage = "Hello!";
        String actualMessage = helloWorld.hello(null);
        Assert.assertEquals(actualMessage,expectedMessage,actualMessage);
    }


    @Test
    public void testHello3(){
        String expectedMessage = "Hello Karan!";
        String actualMessage = helloWorld.hello("Karan");
        Assert.assertEquals(actualMessage,expectedMessage);
    }


    @Test
    public void testHello4(){
        String expectedMessage = "Hello!";
        String actualMessage = helloWorld.hello("");
        Assert.assertEquals(actualMessage,expectedMessage);
    }


    @Test
    public void testHello5(){
        helloWorld = new HelloWorld();
        String expectedMessage = "Hello!";
        String actualMessage = helloWorld.hello("    ");
        Assert.assertEquals(actualMessage,expectedMessage);
    }


    @Test
    public void hello6(){
        helloWorld = new HelloWorld();
        String expectedMessage = "Hello!";
        String actualMessage = helloWorld.hello("    ");
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
