package groupid.mavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Web_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "F:\\cd100.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("eoffice GHMC");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//div[@class='yuRUbf']//h3[@class='LC20lb MBeuO DKV0Md']")).click();
	driver.close();
}}
