package core.TestPage;

import java.awt.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.konfer.util.BaseClass;
import core.pageobjects.LoginPage;

public class LinkCheck extends BaseClass {
	
	
  
public static void main(String[] args) throws InterruptedException {
	
	
	 BaseClass.intializebrowser();
	
   LoginPage login=new LoginPage();
   login.Login("adnan.mohd@vis360.co.uk", "Admin@123");
   
   java.util.List<WebElement> allLinks = driver.findElements(By.tagName("a"));
   
//   for(WebElement link:allLinks){
//   System.out.println(link.getText() + " - " + link.getAttribute("href"));
//   
   Iterator<WebElement> it = allLinks.iterator();

   while(it.hasNext()){

   String url = it.next().getAttribute("href");

   System.out.println(url);

   if(url == null || url.isEmpty()){
   System.out.println("URL is either not configured for anchor tag or it is empty");
   continue;
   }

//   if(!url.startsWith(homePage)){
//   System.out.println("URL belongs to another domain, skipping it.");
//   continue;
//   }

   try {
   HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());

   huc.setRequestMethod("HEAD");

   huc.connect();

   int respCode = huc.getResponseCode();

   if(respCode >= 400){
   System.out.println(url+" is a broken link");
   }
   else{
   System.out.println(url+" is a valid link");
   }

   } catch (MalformedURLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
   } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
   }
   }

   driver.quit();

   }
   }






