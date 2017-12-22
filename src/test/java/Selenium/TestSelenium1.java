/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 *
 * @author Administrateur
 */
public class TestSelenium1 {
    
    @Test
    public void testTitle()
    {
        WebDriver driver=new FirefoxDriver();
       driver.get("http://localhost:8080/JenkinsTest/faces/client/List.xhtml");
        String Expectedtitle = "List";
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        Assert.assertEquals(Actualtitle, Expectedtitle);
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
        System.out.println("");
    }
    
    @Test
    public void testAbs()
    {
        System.out.println("Second Abstract Test");
    }
}
