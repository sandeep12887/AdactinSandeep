package com.helper;


import org.openqa.selenium.WebDriver;

import com.pomClasses.LoginPage;
import com.pomClasses.Welcome_page;

public class PageObjectManager {
	public WebDriver driver;

	public PageObjectManager(WebDriver fdriver) {
		this.driver = fdriver;
	}

	public LoginPage lp;

	public LoginPage getLp() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	public Welcome_page wp;
	public Welcome_page getWp()
	{
		if(wp==null)
		{
			wp=new Welcome_page(driver);
		}
		return wp;
	}


	

	
}
