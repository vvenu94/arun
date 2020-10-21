package org.ios;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Alert extends LibGlobal {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
		System.gc();
	}

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("selenium");
		li.add("text");

		
//		Alert a=new Alert();
//		a.chromeBrowserLaunch();
//		a.urlLaunch("http://demo.automationtesting.in/Alerts.html");
//		WebElement btnClick = a.elementByXpath("//button[@class='btn btn-danger']");
//		a.btnClick(btnClick);
//		a.alert();
	System.gc();
	
		
	}
}
