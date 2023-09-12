package com.comcast.crm.objectrepositoryutility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewInvoice {
	
	public CreatingNewInvoice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTextField;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[3]")
	private WebElement salesOrderLookUpButton;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[4]")
	private WebElement contactNameLookUpButton;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[5]")
	private WebElement organizationNameLoopUpButton;
	
	@FindBy(xpath = "//img[@title='Products']")
	private WebElement itemNameLookUpButton;
	
	@FindBy(name = "qty1")
	private WebElement quantityTextField;
	
	@FindBy(xpath = "//input[@value='Add Product']")
	private WebElement addProductButton;
	
	@FindBy(xpath = "//input[@value='Add Service']")
	private WebElement addServiceButton;
	
	@FindBy(xpath = "(//input[@value='  Save  '])[2]")
	private WebElement saveButton;
	
	@FindBy(xpath = "(//input[@value='  Cancel  '])[1]")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@name='customerno']")
	private WebElement customerNoTextField;
	
	@FindBy(xpath = "//input[@name='salescommission']")
	private WebElement salesCommissionTextField;
	
	@FindBy(name = "invoicestatus")
	private WebElement statusBropDown;
	
	@FindBy(name = "bill_street")
	private WebElement billingAddressTextField;
	
	@FindBy(name = "ship_street")
	private WebElement shippingAddressTextField;
	
	@FindBy(name = "invoicedate")
	private WebElement invoiceDate;
	
	@FindBy(xpath = "//img[@title='Services']")
	private List<WebElement> addServicesLookUpButton;
	
	@FindBy(xpath = "(//a[@class='listFormHeaderLinks'])[1]/../../../tr/td[1]/a")
	private List<WebElement> selectContactName;
	
	@FindBy(xpath = "(//td[@class='lvtCol'])[2]/../../tr/td[2]/a")
	private List<WebElement> selectSalesOrder;
	
	@FindBy(xpath = "(//a[@class='listFormHeaderLinks'])[1]/../../../tr/td[1]/a")
	private List<WebElement> selectOrganizationName;
	
	@FindBy(xpath = "(//td[@class='lvtCol'])[2]/../../tr/td[2]/a")
	private List<WebElement> selectItemName;
	
	@FindBy(xpath = "(//td[@class='lvtCol'])[2]/../../tr/td[2]/a")
	private List<WebElement> selectServiceName;
	
	@FindBy(xpath = "//input[@name='listPrice1']/../img")
	private WebElement listPriceLookUp;
	
	@FindBy(xpath = "//span[text()='No Price Books Found !']")
	private WebElement listPriceText;
	
	public WebElement getListPriceText() {
		return listPriceText;
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getListPriceLookUp() {
		return listPriceLookUp;
	}

	public WebElement getSalesOrderLookUpButton() {
		return salesOrderLookUpButton;
	}

	public WebElement getContactNameLookUpButton() {
		return contactNameLookUpButton;
	}

	public WebElement getOrganizationNameLoopUpButton() {
		return organizationNameLoopUpButton;
	}

	public WebElement getItemNameLookUpButton() {
		return itemNameLookUpButton;
	}

	public WebElement getQuantityTextField() {
		return quantityTextField;
	}

	public WebElement getAddProductButton() {
		return addProductButton;
	}

	public WebElement getAddServiceButton() {
		return addServiceButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getCustomerNoTextField() {
		return customerNoTextField;
	}

	public WebElement getSalesCommissionTextField() {
		return salesCommissionTextField;
	}

	public WebElement getStatusBropDown() {
		return statusBropDown;
	}

	public WebElement getBillingAddressTextField() {
		return billingAddressTextField;
	}

	public WebElement getShippingAddressTextField() {
		return shippingAddressTextField;
	}

	public WebElement getInvoiceDate() {
		return invoiceDate;
	}

	public List<WebElement> getAddServicesLookUpButton() {
		return addServicesLookUpButton;
	}

	public List<WebElement> getSelectContactName() {
		return selectContactName;
	}

	public List<WebElement> getSelectSalesOrder() {
		return selectSalesOrder;
	}

	public List<WebElement> getSelectOrganizationName() {
		return selectOrganizationName;
	}

	public List<WebElement> getSelectItemName() {
		return selectItemName;
	}

	public List<WebElement> getSelectServiceName() {
		return selectServiceName;
	}
	
	
		
}
