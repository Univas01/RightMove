package com.rightmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.rightmove.qa.base.TestBase;
import com.rightmove.qa.util.TestUtil;

public class SearchPage extends TestBase {

	@FindBy(xpath = "//h1[contains(text(), 'property for sale in')]")
	WebElement buyHeaderTitle;
	
	@FindBy(xpath = "//h1[contains(text(), 'property to rent in')]")
	WebElement rentHeaderTitle;

	@FindBy(id = "radius")
	WebElement searchRadiusDDM;

	@FindBy(id = "minPrice")
	WebElement minPriceRangeDDM;

	@FindBy(id = "maxPrice")
	WebElement maxPriceRangeDDM;

	@FindBy(id = "minBedrooms")
	WebElement minBedroomsDDM;

	@FindBy(id = "maxBedrooms")
	WebElement maxBedroomsDDM;

	@FindBy(id = "displayPropertyType")
	WebElement PropertyTypeDDM;

	@FindBy(id = "maxDaysSinceAdded")
	WebElement TimeAddedToSiteDDM;

	@FindBy(xpath = "//span[@class='tickbox--indicator']")
	WebElement indicatorTickBox;

	@FindBy(id = "submit")
	WebElement findPropertiesBtn;

	@FindBy(id = "sortType")
	WebElement sortTOrderDDM;

	@FindBy(xpath = "//div[@data-test='propertyCard-1']/div/div/div[4]/div/div[2]/a/h2")
	WebElement firstNonFeaturedProperty;

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyBuyHeaderTitle() {
		return buyHeaderTitle.isDisplayed();
	}

	public boolean verifyRentHeaderTitle() {
		return rentHeaderTitle.isDisplayed();
	}
	
	public Select clickOnSearchRadiusDDM() {
		return new Select(searchRadiusDDM);

	}

	public Select clickOnMinPriceRangeDDM() {
		return new Select(minPriceRangeDDM);

	}

	public Select clickOnMaxPriceRangeDDM() {
		return new Select(maxPriceRangeDDM);

	}

	public Select clickOnMinBedroomsDDM() {
		return new Select(minBedroomsDDM);

	}

	public Select clickOnMaxBedroomsDDM() {
		return new Select(maxBedroomsDDM);

	}

	public Select clickOnPropertyTypeDDM() {
		return new Select(PropertyTypeDDM);

	}

	public Select clickOnTimeAddedToSiteDDM() {
		return new Select(TimeAddedToSiteDDM);
	}
	
	public String verifyFirstNonFeaturedPropertyTitlePage() {
		return driver.getTitle();
	}
	
	public String firstNonFeaturedPropertyHeading() {
		return firstNonFeaturedProperty.getText();
	}

	public void offerCheckBox() {
		if (indicatorTickBox.isSelected()) {
			System.out.println("Offer checkbox is already ticked");
		} else {
			TestUtil.clickMethodJS(indicatorTickBox);
		}
	}

	public void clickOnFindPropertiesBtn() {
		TestUtil.clickMethodJS(findPropertiesBtn);
	}

	public Select clickOnSortOrderDDM() {
		return new Select(sortTOrderDDM);
	}
	
	public void clickOnFirstNonFeaturedProperty() {
		TestUtil.scrollIntoView(firstNonFeaturedProperty, driver);
		TestUtil.clickMethodJS(firstNonFeaturedProperty);
	}
}
