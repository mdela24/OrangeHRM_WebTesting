package ejecuciones;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class hook {
	
	static WebDriver driver;
//	AndroidDriver<WebElement> driver;
//	protected static AppiumDriver<WebElement> driver;

	@Before
	public void setup() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//			DesiredCapabilities cap = new DesiredCapabilities();
			
//			cap.setCapability("platformName", "Android");
//			cap.setCapability("deviceName", "emulator-5554");
//			cap.setCapability(MobileCapabilityType.APP,"C:\\apk\\selendroid-test-app-0.17.0.apk");
//			driver= new AndroidDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
//			driver.manage().window().maximize();
//			driver.get("https://www.youtube.com/");
			
//			cap.setCapability("platformName", "Android");
//			cap.setCapability("platformVersion", "10.0");
//			cap.setCapability("deviceName", "emulator-5554");
//			cap.setCapability("noReset", true);
//			cap.setCapability("app","C:\\apk\\selendroid-test-app-0.17.0.apk");
//			cap.setCapability("appPackage", "C:\\apk\\io.selendroid.testapp:0.17.0");
//			cap.setCapability("noSign", true);
//			cap.setCapability("autoGranPermissions", true);
//			driver = new AppiumDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
//			driver.manage().window().maximize();
//			driver.get("https://www.youtube.com/");
	
//		}
	}
	
	static WebDriver getDriver () {
		return driver;
	}

	@After
	public void tearDown () throws InterruptedException {
		//	 Thread.sleep(3000);
		//	 driver.close();
	}


}
