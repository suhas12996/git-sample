package Android1;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities; //Used to set device properties:device name, platform, version, app package name, activity name, etc. It has various methods eg. setCapability()-> used to set the device name, platform version, platform name, absolute path of the app under test (the .apk file of the app(Android) under test), app Activity (in Android) and appPackage(java).
import org.testng.annotations.BeforeTest; //@Before Test annotated method will be executed before any @Test method
import org.testng.annotations.Test;

public class Demo1 {
	static AppiumDriver driver;

	public static void main(String[] args) {
	}

	public static void Launchingapp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Realme C21"); // obtained from the command "adb devices"
		capabilities.setCapability("udid", "TS5HAEEMDYAUVKRS");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.loyaltyhub");
		capabilities.setCapability("appActivity", "com.loyaltyhub.MainActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Application  Started");

		driver.findElement(By.className("android.widget.EditText")).sendKeys("2354654323");
		driver.findElement(By.className("android.view.ViewGroup")).click();
		driver.findElement(By.className("android.widget.Button")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("123456");
		System.out.println("Successfully launched app");

		driver.quit();
	}

}
