package com.comcast.crm.invoicetest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.ConatctPage;
import com.comcast.crm.objectrepositoryutility.CreatingNewContactPage;
import com.comcast.crm.objectrepositoryutility.CreatingNewOrganizationPage;
import com.comcast.crm.objectrepositoryutility.CreatingNewProductPage;
import com.comcast.crm.objectrepositoryutility.CreatingNewSalesOrder;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.objectrepositoryutility.ProductPage;
import com.comcast.crm.objectrepositoryutility.SalesOrderPage;

@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class PreConditions extends BaseClass{

	@Test
	public void createOrganization() throws Throwable {
		UtilityClassObject.getTest().log(Status.INFO, "read data from Excel");
		String orgName = eLib.getDataFromExcel("org", 1, 2)+ jLib.getRandomNumber();
		UtilityClassObject.getTest().log(Status.INFO, "navigate to Org Page");
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		UtilityClassObject.getTest().log(Status.INFO, "navigate to create Org Page");
		OrganizationsPage cnp = new OrganizationsPage(driver);
		cnp.getCreateNewOrgBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Create a new Org");
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrg(orgName);
		UtilityClassObject.getTest().log(Status.INFO, orgName + "===>Create a new Org");
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actOrgName = oip.getHeaderMsg().getText();
		Assert.assertEquals(true, actOrgName.contains(orgName));
		Thread.sleep(3000);
	}

	@Test
	public void createContact() throws Throwable {
		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();
		HomePage hp = new HomePage(driver);
		hp.getContactlnk().click();
		ConatctPage cp = new ConatctPage(driver);
		cp.getCreateNewOrgBtn().click();
		CreatingNewContactPage ccp = new CreatingNewContactPage(driver);
		ccp.createContact(lastName);
		String actHearder = cp.getHeaderMsg().getText();
		boolean status = actHearder.contains(lastName);
		Assert.assertEquals(status, true);
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actLastName, lastName);
		soft.assertAll();
		Thread.sleep(3000);
	}
	
	@Test
	public void createProduct() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getProductLink().click();
		
		ProductPage pp=new ProductPage(driver);
		pp.getCreateProductButton().click();
		
		CreatingNewProductPage product=new CreatingNewProductPage(driver);
		product.getProductNameTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,0)+jLib.getRandomNumber());
		product.getSaveButton().click();
		Thread.sleep(3000);
	}
	
	@Test
	public void createSalesOrder() throws Throwable {
		HomePage hp = new HomePage(driver);
		WebDriverUtility web=new WebDriverUtility();
		web.mousemoveOnElement(driver, hp.getMoreLink());
		hp.getSalesOrderLink().click();
		
		SalesOrderPage sale=new SalesOrderPage(driver);
		sale.getCreateSalesButton().click();
		
		CreatingNewSalesOrder salesOrder=new CreatingNewSalesOrder(driver);
		salesOrder.getSubjectTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,0)+jLib.getRandomNumber());
		salesOrder.getOrganizationNameLookUp().click();
		web.switchToTabOnURL(driver, "Accounts&action");
		salesOrder.getSelectOrganizationName().get(1).click();
		web.switchtoAlertAndAccept(driver);
		web.switchToTabOnURL(driver, "SalesOrder&action");
		salesOrder.getBillingAddressTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,1));
		salesOrder.getShippingAddressTextField().sendKeys(eLib.getDataFromExcel("Akshay",1,2));
		salesOrder.getItemNameLookUp().click();
		web.switchToTabOnURL(driver, "Products&action");
		Thread.sleep(3000);
		salesOrder.getSelectItemName().get(2).click();
		web.switchToTabOnURL(driver, "SalesOrder&action");
		salesOrder.getQuantityTextField().sendKeys("5");
		salesOrder.getSaveButton().click();
		Thread.sleep(3000);
	}

}
