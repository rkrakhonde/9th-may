package S3_SeleniumSetup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1_OpenChromeBrowser
{
    public static void main(String[]args) {
          ChromeDriver driver = new ChromeDriver();
          // EdgeDriver e=new EdgeDriver();

             //FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());
        //driver.close();
    }

    }
