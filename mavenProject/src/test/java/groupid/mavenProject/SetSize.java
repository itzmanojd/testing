package groupid.mavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
public class SetSize {
   @SuppressWarnings("deprecation")
public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "F:\\cd100.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      // maximize the browser
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      // fetching the current window size with getSize()
      System.out.println(driver.manage().window().getSize());
      //Create object of Dimensions class
      Dimension dm = new Dimension(450,630);
      //Setting the current window to that dimension
      driver.manage().window().setSize(dm);
      //driver.close();
   }
}