package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {

    @Test
    public void scroll_using_jsexecutor_1(){
        //Get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //Create instance of JSExecutor and cast our driver type to it.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //use execute script method


        for (int i = 0; i < 10 ; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 500)");

        }

    }

    @Test
    public void scroll_using_jsexecutor_2(){
        //get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        //use js executor to scroll 'Cybertek School' link intoView
        


    }

}
