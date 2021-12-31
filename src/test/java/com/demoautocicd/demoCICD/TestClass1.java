package com.demoautocicd.demoCICD;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver webdriver;
	public static final String USERNAME = "hmwepwintphyu1";
	public static final String AUTOMATE_KEY = "8sy2nooMbDaVCeJsLMFS";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	@BeforeMethod
  public void launchDriver() throws MalformedURLException {
//	  System.setProperty("webdriver.chrome.driver","D:\\Demo-Eclipse\\demoCICD\\drivers\\chromedriver.exe");
//      ChromeOptions options = new ChromeOptions();
//      options.addArguments("--disable-notification");
//      webdriver= new ChromeDriver(options);
//      webdriver.manage().window().maximize();
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setCapability("browserName", "chrome");
//		chromeOptions.setCapability("platform", "WIN10");
//		chromeOptions.setCapability("platformName", "WINDOWS");
//		chromeOptions.setCapability("seleniumProtocol", "WebDriver");
//		chromeOptions.setCapability("maxInstances", "5");
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setCapability("browser", "firefox");
		firefoxOptions.setCapability("browser_version", "95.0");
		firefoxOptions.setCapability("os", "Windows");
		firefoxOptions.setCapability("os_version", "10");
		firefoxOptions.setCapability("build", "browserstack-build-1");
		firefoxOptions.setCapability("name", "Thread 2");
		firefoxOptions.setCapability("project", "DemoCICD");
		firefoxOptions.setCapability("build", "Build1");
		firefoxOptions.setCapability("name", "TestCaseName");
		
		webdriver = new RemoteWebDriver(new URL(URL), firefoxOptions);

		//webdriver = new RemoteWebDriver(new URL("http://192.168.142.107:4444/wd/hub"), chromeOptions);
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
//		webdriver = new RemoteWebDriver(new URL("http://192.168.0.113:4444/wd/hub"), dr);
//		System.setProperty("webdriver.chrome.driver","D:\\Demo-Eclipse\\demoCICD\\drivers\\chromedriver.exe");
		
  }
  @Test
  public void Test1() {
	  webdriver.navigate().to("https://ebguat.2c2p.com/mm");
	  System.out.println("Test 1 title is " +webdriver.getTitle());
  }
  @Test
  public void Test2() {
	  webdriver.navigate().to("https://ebguat.2c2p.com/mm");
	  System.out.println("Test 2 title is " +webdriver.getTitle());
  }
  @Test
  public void Test3() {
	  webdriver.navigate().to("https://ebguat.2c2p.com/mm");
	  System.out.println("Test 3 title is " +webdriver.getTitle());
  }
  @AfterMethod
  public void quit() {
     webdriver.quit();
  }
  
}
