package io.raveerocks;

public class HelloWorld {

    public String hello(String name){
        return "Hello"+((name==null || name.isEmpty() || name.isBlank())?(""):(" "+name))+"!";
    }
}
