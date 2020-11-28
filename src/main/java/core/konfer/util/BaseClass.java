package core.konfer.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


static String Url="https://stage.konfer.online/";
final static String browsername="chrome";
public static WebDriver driver;




public static WebDriver intializebrowser()

{
	
boolean bool = false;
boolean bool1= false;

if(bool1=browsername.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
System.out.println(bool1);
driver=new ChromeDriver();

}

else
{
	System.out.println(bool);
	WebDriverManager.firefoxdriver().setup();
	
	
	driver=new FirefoxDriver();
}

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get(Url);
return driver;

}




	
}





