package secondwebsite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class second {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.getcalley.com/calley-lifetime-offer-expired/");
		Dimension d =new Dimension(1366,768);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.quit();

	}

}
