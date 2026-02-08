package com.pageobjectmodel;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

    import com.base.BaseClass;
     import com.interfaceelements.AddressInterPageFaceElements;

        public class AddressPage extends BaseClass implements AddressInterPageFaceElements {
		@FindBy(id = name_id)
		private WebElement name;

		@FindBy(id = country_id)
		private WebElement country;

		@FindBy(id = city_id)
		private WebElement city;

		@FindBy(id = card_id)
		private WebElement card;

		@FindBy(id = month_id)
		private WebElement month;

		@FindBy(id = year_id)
		private WebElement year;

		@FindBy(xpath = purchase_xpath)
		private WebElement purchase;

		@FindBy(xpath = confirm_xpath)
		private WebElement confirm;

        public AddressPage() {
			PageFactory.initElements(driver, this);
		}

		public void placeOrder() throws Exception {
			passInput(name, "gunachowdari");
			passInput(country, "India");
			passInput(city, "Tirupati");
			passInput(card, "123456789");
			passInput(month, "02");
			passInput(year, "2027");
			clickOnElement(purchase);
			getText(confirm);
			takeScreenshot("OrderSuccess");
		}
	}
