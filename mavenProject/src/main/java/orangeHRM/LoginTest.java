package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\cd100.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parichay.nic.in/pnv1/assets/login.html?service=passive&active=true&rm_5=false&continue=https%3A%2F%2Fjan_com%2Fmail%2F&pp=1&scc=1&lmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&sid=eOfficeGHMC");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).clear();
		driver.findElement(By.id("txtUserName")).sendKeys("ranjith.mudavath@gov.in");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-group m-0 my-auto']/input[@type='password']")).clear();
		driver.findElement(By.xpath("//div[@class='input-group m-0 my-auto']/input[@type='password']")).sendKeys("Ghmc@123");
		Thread.sleep(500);
		driver.findElement(By.id("userNameNextButton")).click();
		Thread.sleep(500);
		//driver.close();
		
		
	}

}
