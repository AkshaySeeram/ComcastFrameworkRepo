package com.comcast.crm.invoicetest;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.InvoicePage;

public class TC_11_Test extends BaseClass{
	
	@Test
	public void delete_MultipleInvoiceDetails_fromListView() throws InterruptedException {
		HomePage home=new HomePage(driver);
		WebDriverUtility web=new WebDriverUtility();
		web.mousemoveOnElement(driver, home.getMoreLink());
		home.getInvoiceLink().click();
		
		InvoicePage invoice=new InvoicePage(driver);
		invoice.getSelectCheckBox().get(1).click();
		Thread.sleep(2000);
		invoice.getSelectCheckBox().get(2).click();
		invoice.getDeleteButton().click();
		web.switchtoAlertAndAccept(driver);
		Thread.sleep(3000);
	}
	
}
