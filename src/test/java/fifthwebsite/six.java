package fifthwebsite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class six {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		Dimension d =new Dimension(375,667);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.quit();

	}

}
