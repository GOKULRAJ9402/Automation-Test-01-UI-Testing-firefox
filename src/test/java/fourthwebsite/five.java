package fourthwebsite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class five {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.getcalley.com/calley-teams-features/");
		Dimension d =new Dimension(414,896);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.quit();

	}

}
