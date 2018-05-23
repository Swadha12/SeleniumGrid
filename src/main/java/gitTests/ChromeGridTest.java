package gitTests;
// java -jar selenium-server-standalone-3.0.0.jar -role hub
//java –Dwebdriver.chrome.driver=”C:\Users\stripathi\Desktop\selenium\chromedriver” -jar selenium-server-standalone-3.0.0.jar –role node –hub http://10.3.15.83:4444/grid/register/
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		cap.setPlatform(Platform.WIN10);   
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		String hubUrl="http://10.3.15.83:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap); 
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());


	}

}
