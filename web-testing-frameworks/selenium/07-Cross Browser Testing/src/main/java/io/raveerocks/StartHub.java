package io.raveerocks;

import org.openqa.selenium.os.CommandLine;

public class StartHub {

    public static void main(String[] args) {
        ///usr/local/drivers/selenium-server-standalone-3.141.59.jar
        CommandLine commandLine = new CommandLine("java","-jar","selenium-server-standalone-3.141.59.jar", "-role", "hub");
        commandLine.execute();
    }
}
