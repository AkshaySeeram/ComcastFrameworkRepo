package com.comcast.crm.objectrepositoryutility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewSalesOrder {
	
	public CreatingNewSalesOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "subject")
	private WebElement subjectTextField;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[3]")
	private WebElement opportunityNameLookUp;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[4]")
	private WebElement quoteNameLookUp;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[5]")
	private WebElement contactNameLookUP;
	
	@FindBy(xpath = "(//img[@align='absmiddle'])[6]")
	private WebElement organizationNameLookUp;
	
	@FindBy(xpath = "(//table[@class='small'])[3]/tbody/tr/td[2]/a")
	private List<WebElement> selectItemName;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public List<WebElement> getSelectItemName() {
		return selectItemName;
	}

	public WebElement getQuantityTextField() {
		return quantityTextField;
	}

	@FindBy(xpath = "(//td[@class='lvtCol'])[1]/../../tr/td[1]/a")
	private List<WebElement> selectOrganizationName;
	
	@FindBy(name = "bill_street")
	private WebElement billingAddressTextField;
	
	@FindBy(name = "ship_street")
	private WebElement shippingAddressTextField;
	
	@FindBy(id = "searchIcon1")
	private WebElement itemNameLookUp;
	
	@FindBy(xpath = "//input[@id='listPrice1']/../img")
	private WebElement listPriceLookUp;
	
	@FindBy(name = "qty1")
	private WebElement quantityTextField;
	
	
	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getOpportunityNameLookUp() {
		return opportunityNameLookUp;
	}

	public WebElement getQuoteNameLookUp() {
		return quoteNameLookUp;
	}

	public WebElement getContactNameLookUP() {
		return contactNameLookUP;
	}

	public WebElement getOrganizationNameLookUp() {
		return organizationNameLookUp;
	}

	public List<WebElement> getSelectOrganizationName() {
		return selectOrganizationName;
	}

	public WebElement getBillingAddressTextField() {
		return billingAddressTextField;
	}

	public WebElement getShippingAddressTextField() {
		return shippingAddressTextField;
	}

	public WebElement getItemNameLookUp() {
		return itemNameLookUp;
	}

	public WebElement getListPriceLookUp() {
		return listPriceLookUp;
	}
	
	
	
	
	
}
