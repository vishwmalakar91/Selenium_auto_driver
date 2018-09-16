/* Sample code by V Malakar - it will auto download chromedriver and run it*/
package Selenium.auto_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://github.com");
        System.out.print("Success ! No Need to Setup Chrome driver");
        d.quit();
        
    }
}
