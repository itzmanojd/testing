package groupid.mavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\cd100.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://google.com");
		TakesScreenshot ss=((TakesScreenshot)driver);
		File SrcFile=ss.getScreenshotAs(OutputType.FILE);
		File Destfile = new File("F:\\aa.png");
		FileUtils.copyFile(SrcFile,Destfile);
		

	}

}
