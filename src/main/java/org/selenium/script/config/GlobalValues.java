package org.selenium.script.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalValues {
    public static Properties properties = new Properties();
    public static WebDriver driver = null;
    public void getAppPropFileContent() {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("config/application.properties");
            GlobalValues.properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println(GlobalValues.properties);
        }
    }

    public void setDriver(){
        if(("FirefoxDriver").equalsIgnoreCase(GlobalValues.properties.getProperty("target-agent"))){
            GlobalValues.driver= new FirefoxDriver();
        } else if(("EdgeDriver").equalsIgnoreCase(GlobalValues.properties.getProperty("target-agent"))){
            GlobalValues.driver= new EdgeDriver();
        }else if(("InternetExplorerDriver").equalsIgnoreCase(GlobalValues.properties.getProperty("target-agent"))){
            GlobalValues.driver= new InternetExplorerDriver();
        }else if(("SafariDriver").equalsIgnoreCase(GlobalValues.properties.getProperty("target-agent"))){
            GlobalValues.driver= new SafariDriver();
        }else {
            GlobalValues.driver= new ChromeDriver(); //ChromeDriver default
        }
    }
}
