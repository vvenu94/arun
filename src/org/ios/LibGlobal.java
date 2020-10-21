package org.ios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal {
	static WebDriver driver;
	static Actions action;
	static Robot robot;
	static File src, des;
	static Alert alert;
	static JavascriptExecutor js;

	// to launch the browser
	public void chromeBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venugopal\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// to launch the URL
	public void urlLaunch(String url) {
		driver.get(url);

	}

	// to findElement by Xpath
	public WebElement elementByXpath(String xpath) {
		WebElement b = driver.findElement(By.xpath(xpath));
		return b;

	}

	// to findElement by Id
	public WebElement elementById(String id) {
		WebElement b = driver.findElement(By.id(id));
		return b;
	}

	// to findElement by Name
	public WebElement elementByName(String name) {
		WebElement b = driver.findElement(By.name(name));
		return b;

	}

	// to enter the text input
	public void type(WebElement a, String b) {
		a.sendKeys(b);

	}

	// to click the button
	public void btnClick(WebElement c) {
		c.click();

	}

	// to get title
	public String title() {
		String title = driver.getTitle();
		return title;
	}

	// to get currenturl
	public String getUrl() {
		String getUrl = driver.getCurrentUrl();
		return getUrl;
	}

	// to perform movetoElement actions
	public void moveToElement(WebElement c) {
		action = new Actions(driver);
		action.moveToElement(c).perform();
	}

	// to perform DragAndDrop
	public void dragDrop(WebElement a, WebElement b) {
		action = new Actions(driver);
		action.dragAndDrop(a, b).perform();
	}

	// to perform contextClick
	public void contextClick(WebElement a) {
		action = new Actions(driver);
		action.contextClick(a).perform();
	}

	// to perform DoubleClick
	public void doubleClick(WebElement a) {
		action = new Actions(driver);
		action.doubleClick(a).perform();
	}

	// to perform KeyPress in robot
	public void keyPress(int c) throws Exception {
		robot = new Robot();
		robot.keyPress(c);

	}

	// to perform KeyRelease in robot
	public void keyRelease(int c) throws Exception {
		robot = new Robot();
		robot.keyRelease(c);

	}

	// to take Screenshot
	public void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		src = ts.getScreenshotAs(OutputType.FILE);
		des = new File("C:\\Users\\venugopal\\eclipse-workspace\\Selenium\\Excel\\Image1.png");

		FileUtils.copyFile(src, des);

	}

	public void alert() {
		alert = driver.switchTo().alert();

	}

	// to get input from javaScript
	public void javaScriptInput(String a, WebElement b) {
		js = (JavascriptExecutor) driver;
		js.executeAsyncScript(a, b);

	}

	// to click using javaScript
	public void javaScriptClick(WebElement a) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", a);

	}

	// to ScrollDown using JavaScript
	public void jsScrollDown(WebElement a) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", a);

	}

	// to ScrollUp using JavaScript
	public void jsScrollUp(WebElement a) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", a);

	}

	// to get input text fromJavaScript
	public String getInputText(WebElement a) {
		js = (JavascriptExecutor) driver;
		String txtInput = js.executeScript("return arguments[0].getAttribute('value')", a).toString();
		return txtInput;

	}

}
