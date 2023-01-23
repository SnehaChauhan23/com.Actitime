package com.crm.Actitime.objectRepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Actitime.GenericLibrary.ReadDataFromExcel;

public class TaskPage {
	//Deceleration
	@FindBy (xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement newcustomerbtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customertextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontext;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement dropdown;
	
	@FindBy(xpath="(//div[.='Our company'])[9]")
	private WebElement companyname;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createbtn;
	
	//Initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);          
		
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomerbtn() {
		return newcustomerbtn;
	}

	public WebElement getCustomertextfield() {
		return customertextfield;
	}

	public WebElement getDescriptiontext() {
		return descriptiontext;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}
	
	//business logic-utilization
	public void createcustomer() throws EncryptedDocumentException, IOException {
		ReadDataFromExcel r=new ReadDataFromExcel();
		String customername = r.readdataexcel("Sheet1", 1, 1);
		String domain = r.readdataexcel("Sheet1", 1, 2);
		addnewbtn.click();
		newcustomerbtn.click();
		customertextfield.sendKeys(customername);
		descriptiontext.sendKeys(domain);
		dropdown.click();
		companyname.click();
		createbtn.click();
		
		
		
	}
	

}
