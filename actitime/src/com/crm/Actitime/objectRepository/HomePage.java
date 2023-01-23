package com.crm.Actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(id="//div[.='Login ']")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);            //initialization
	}

	public WebElement getTaskLink() {
		return taskLink;
	}

	

	public WebElement getReportsLink() {
		return reportsLink;
	}

	
	public WebElement getUsersLink() {
		return usersLink;
	}

	

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	//bussiness logic use for uitilization
	
	public void clickOntaskTab() {
		taskLink.click();
	}
	
	
	
	
	

}
