package model;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "https://www.paysera.lt/v2/en-LT/fees/currency-conversion-calculator#/";

    public static By sellField = By.xpath("//body/main[1]/article[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
    public static By buyField = By.xpath("//body/main[1]/article[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]");

}

