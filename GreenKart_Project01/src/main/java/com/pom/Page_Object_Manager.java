package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private PomPage p1;
	
	private PomPage01 p2;
	
	private PomPage02 p3;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public PomPage getInstancePomPage() {
		
		p1 = new PomPage(driver);
		
		return p1;
	}
	
	public PomPage01 getInstancePomPage01() {
	
		p2 = new PomPage01(driver);
		return p2;

	}
	
	public PomPage02 getInstancePomPage02() {
		
		p3 = new PomPage02(driver);
		return p3;

	}

}
