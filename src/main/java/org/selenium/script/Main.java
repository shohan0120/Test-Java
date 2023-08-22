package org.selenium.script;


import org.selenium.script.init.Bootstrap;
import org.selenium.script.test.Rajuk;
import org.selenium.script.test.VATPrompt;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Bootstrap().init();
    }
}
