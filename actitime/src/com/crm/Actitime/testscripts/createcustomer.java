package com.crm.Actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Actitime.GenericLibrary.BaseClass;

import com.crm.Actitime.GenericLibrary.ListenerImplementation;
import com.crm.Actitime.objectRepository.HomePage;
import com.crm.Actitime.objectRepository.TaskPage;
@Listeners(ListenerImplementation.class)
public class createcustomer extends BaseClass {
@Test
public void createcustomer() throws EncryptedDocumentException, IOException
{
	
	
	HomePage hp=new HomePage(driver);
	hp.clickOntaskTab();
	
	TaskPage tp=new TaskPage(driver);
	tp.createcustomer();

}
}
