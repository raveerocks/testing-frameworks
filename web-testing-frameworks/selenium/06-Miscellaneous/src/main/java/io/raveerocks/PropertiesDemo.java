package io.raveerocks;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("/opt/training/technical/selenium/06-Miscellaneous/src/main/resources/data.properties");
        properties.load(fileInputStream);
        System.out.println("username : "+properties.get("username"));
        System.out.println("password : "+properties.get("password"));
    }
}
