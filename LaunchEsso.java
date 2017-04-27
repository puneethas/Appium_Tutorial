package Android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchEsso {
	private static AndroidDriver driver;
	public static void main(String[] args) throws Exception {
		
		File classpathRoot = new File(System.getProperty("user.dir"));  //// Path to Eclipse project
		File appDir = new File(classpathRoot, "/Apps_Stage1/EssoQA/");
		File app = new File(appDir, "Esso_QA-_CR_8009.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "4.4.2");
		cap.setCapability("deviceName", "4d00f31577b530a1");
		cap.setCapability("app", app.getAbsolutePath());  // Get app path
		cap.setCapability("appPackage", "com.firstdata.mpl.stage");
		cap.setCapability("appActivity", "com.firstdata.mpl.activity.MplSplashScreenActivity");
		
URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(appiumURL, cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}

}
