package com.crm.Actitime.objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Actitime.GenericLibrary.ReadDataFromProperty;

public class LoginPage {
	@FindBy (id="username") 
	private WebElement untbx;
	
	@FindBy (name="pwd")                                 ///Declaration
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgtbn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);            //initialization
	}

	public WebElement getUntbx() {
		return untbx;
	}

	

	public WebElement getPwtbx() {
		return pwtbx;
	}

	
	public WebElement getLgtbn() {
		return lgtbn;
	}

	//business logic
	
	public void logintoActitime(String UN,String PW)  {
		
		untbx.sendKeys(UN);
		pwtbx.sendKeys(PW);
		lgtbn.click();
	}

}
