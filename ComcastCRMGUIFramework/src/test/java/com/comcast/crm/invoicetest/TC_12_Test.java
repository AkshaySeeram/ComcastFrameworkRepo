package com.comcast.crm.invoicetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.InvoicePage;

@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class TC_12_Test extends BaseClass{

	@Test
	public void MassEdit_MultipleInvoiceDetails() throws Throwable {
		UtilityClassObject.getTest().log(Status.PASS,"Login Successfull");
		HomePage home=new HomePage(driver);
		WebDriverUtility web=new WebDriverUtility();
		web.mousemoveOnElement(driver, home.getMoreLink());
		home.getInvoiceLink().click();
		UtilityClassObject.getTest().log(Status.PASS,"Navigated To Invoice Page");
		InvoicePage invoice=new InvoicePage(driver);
		invoice.getSelectCheckBox().get(0).click();
		invoice.getSelectCheckBox().get(1).click();
		Thread.sleep(2000);
		invoice.getMassEditButton().click();
		Thread.sleep(2000);
		invoice.getMassEditSubjectTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,1));
		invoice.getMassEditOrganizationLookUp().click();
		web.switchToTabOnURL(driver, "Accounts&action");
		invoice.getSelectMassEditOrganizationName().get(3).click();
		web.switchtoAlertAndAccept(driver);
		web.switchToTabOnURL(driver, "Invoice&action");
		invoice.getMassEditSaveButton().click();
		Thread.sleep(3000);
	}
	
}
