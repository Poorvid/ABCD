package com.cybage.alm;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@Test
	public void checkTitle() throws MalformedURLException {
		
		//System.setProperty("phantomjs.binary.path", "lib/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		// driver = new PhantomJSDriver();
		
		//Capabilities caps = new DesiredCapabilities();
	//caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "lib/phantomjs-2.1.1-windows/bin/phantomjs.exe");
	//	driver = new PhantomJSDriver(caps);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"lib/phantomjs.exe");
		WebDriver driver = new  PhantomJSDriver(caps);
		
		driver.get("http://newtours.demoaut.com");
		//driver.get(baseUrl);

		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals("Welcome: Mercuery Tours", driver.getTitle());

		driver.quit();
	}

}
