package org.ios;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Selenium extends LibGlobal {
	
	public static void main(String[] args) throws Exception {
		
		Selenium method=new Selenium();
		
		method.chromeBrowserLaunch();
		method.urlLaunch("https://www.flipkart.com/");
		WebElement txtUserName = method.elementByXpath("//input[@class='_2zrpKA _1dBPDZ']");
//		WebElement txtUserName = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	    method.type(txtUserName,"7868030069");
	    System.out.println(method.getInputText(txtUserName));
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		method.type(txtPassword,"anilvenusrk");
		method.screenShot();
		WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		method.btnClick(btnLogin);
		String title = method.title();
		System.out.println(title);
		String url = method.getUrl();
		System.out.println(url);
		
		Thread.sleep(10000);
		
		
	WebElement cursorMover = driver.findElement(By.xpath("//span[text()='Electronics']"));
	method.moveToElement(cursorMover);
	WebElement txtClick = driver.findElement(By.xpath("//a[text()='Vivo']"));
	method.btnClick(txtClick);
	Thread.sleep(10000);
	WebElement txtProduct = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[2]"));
	method.contextClick(txtProduct);
	

	method.keyPress(KeyEvent.VK_DOWN);
	method.keyRelease(KeyEvent.VK_DOWN);

	method.keyPress(KeyEvent.VK_ENTER);
	method.keyRelease(KeyEvent.VK_ENTER);
	
	

	}

}
