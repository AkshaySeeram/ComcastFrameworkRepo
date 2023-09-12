package com.comcast.crm.objectrepositoryutility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	
	public InvoicePage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Invoice...']")
	private WebElement createInvoice;
	
	@FindBy(xpath = "//input[@name='selected_id']")
	private List<WebElement> selectCheckBox;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//img[@title='Search in Invoice...']")
	private WebElement searchLogo;
	
	@FindBy(xpath = "//input[@class='txtBox']")
	private WebElement searchTextField;
	
	@FindBy(xpath = "(//input[@value='Mass Edit'])[1]")
	private WebElement massEditButton;
	
	@FindBy(xpath = "(//input[@value=' Search Now '])[1]")
	private WebElement searchButton;
	
	@FindBy(id = "viewname")
	private WebElement filterDropDown;
	
	@FindBy(linkText = "Create Filter")
	private WebElement createFilterLink;
	
	@FindBy(xpath = "//img[@alt='Chat...']")
	private WebElement chatLogo;
	
	@FindBy(xpath = "//input[@class='cinput']")
	private WebElement chatTextField;
	
	@FindBy(xpath = "//td[@class='csubmit']")
	private WebElement chatTextSend;
	
	@FindBy(xpath = "//div[@class='cumsg']")
	private List<WebElement> chatAvailableText;
	
	@FindBy(xpath = "Go to Advanced Search")
	private WebElement advanceSearchButton;
	
	@FindBy(id = "bas_searchfield")
	private WebElement inDropDown;
	
	@FindBy(xpath = "(//input[@class='detailedViewTextBox'])[1]")
	private WebElement massEditSubjectTextField;
	
	@FindBy(xpath = "(//a[@class='listFormHeaderLinks'])[1]/../../../tr/td[1]/a")
	private List<WebElement> selectMassEditOrganizationName;
	
	@FindBy(xpath = "(//img[@alt='Select'])[2]")
	private WebElement massEditOrganizationLookUp;
	
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement massEditSaveButton;

	

	public WebElement getMassEditSubjectTextField() {
		return massEditSubjectTextField;
	}

	public List<WebElement> getSelectMassEditOrganizationName() {
		return selectMassEditOrganizationName;
	}

	public WebElement getMassEditOrganizationLookUp() {
		return massEditOrganizationLookUp;
	}

	public WebElement getMassEditSaveButton() {
		return massEditSaveButton;
	}

	public WebElement getInDropDown() {
		return inDropDown;
	}

	public WebElement getSearchLogo() {
		return searchLogo;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getMassEditButton() {
		return massEditButton;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getFilterDropDown() {
		return filterDropDown;
	}

	public WebElement getCreateFilterLink() {
		return createFilterLink;
	}

	public WebElement getChatLogo() {
		return chatLogo;
	}

	public WebElement getChatTextField() {
		return chatTextField;
	}

	public WebElement getChatTextSend() {
		return chatTextSend;
	}

	public List<WebElement> getChatAvailableText() {
		return chatAvailableText;
	}

	public WebElement getAdvanceSearchButton() {
		return advanceSearchButton;
	}

	public WebElement getCreateInvoice() {
		return createInvoice;
	}

	public List<WebElement> getSelectCheckBox() {
		return selectCheckBox;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	

}
