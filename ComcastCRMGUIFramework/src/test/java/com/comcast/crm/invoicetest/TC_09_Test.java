package com.comcast.crm.invoicetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.CreatingNewInvoice;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.InvoicePage;

@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class TC_09_Test extends BaseClass{
	
	@Test
	public void createInvoiceWith_Price_List() throws Throwable {
		UtilityClassObject.getTest().log(Status.PASS,"Login Successfull");
		HomePage home=new HomePage(driver);
		WebDriverUtility web=new WebDriverUtility();
		web.mousemoveOnElement(driver, home.getMoreLink());
		home.getInvoiceLink().click();
		UtilityClassObject.getTest().log(Status.PASS,"Navigated To Invoice Page");
		InvoicePage invoice=new InvoicePage(driver);
		invoice.getCreateInvoice().click();
		UtilityClassObject.getTest().log(Status.PASS,"Navigated To Create Invoice Page");
		CreatingNewInvoice createInvoice=new CreatingNewInvoice(driver);
		createInvoice.getSubjectTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,0)+jLib.getRandomNumber());
		createInvoice.getContactNameLookUpButton().click();
		web.switchToTabOnURL(driver, "Contacts&action");
		createInvoice.getSelectContactName().get(1).click();
		web.switchtoAlertAndAccept(driver);
		web.switchToTabOnURL(driver, "Invoice&action");
		
		createInvoice.getOrganizationNameLoopUpButton().click();
		web.switchToTabOnURL(driver, "Accounts&action");
		createInvoice.getSelectOrganizationName().get(1).click();
		web.switchtoAlertAndAccept(driver);
		web.switchToTabOnURL(driver, "Invoice&action");
		
		createInvoice.getBillingAddressTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,1));
		createInvoice.getShippingAddressTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,2));
		
		createInvoice.getItemNameLookUpButton().click();
		web.switchToTabOnURL(driver, "Products&action");
		Thread.sleep(3000);
		createInvoice.getSelectItemName().get(1).click();
		web.switchToTabOnURL(driver, "Invoice&action");	
		
		createInvoice.getQuantityTextField().sendKeys("5");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);

		createInvoice.getListPriceLookUp().click();
		web.switchToTabOnURL(driver, "PriceBooks&action");	
		String expectedText=eLib.getDataFromExcel("Akshay",3,1);
		String actualText=createInvoice.getListPriceText().getText();
		System.out.println(expectedText);
		System.out.println("------------");
		System.out.println(actualText);
		if(actualText.equals(expectedText)) {
			System.out.println(" Integration Failed No List Price Available ");
		}
		else {
			System.out.println(" List Price Is Available Select One ");
		}
		web.switchToTabOnURL(driver, "Invoice&action");
		web.scrollByView(driver,createInvoice.getSaveButton());
		createInvoice.getSaveButton().click();
		UtilityClassObject.getTest().log(Status.PASS,"Invoice Created Successfully");
		Thread.sleep(3000);
	}

}
