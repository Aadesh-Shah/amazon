package com.Amazon;
import javax.swing.SingleSelectionModel;
public class Amazon {
    ChromeDriver chrome;
		void visitamazon()
		{
			System.setProperty("webdriver.chrome.driver","Desktop:\\190843420001\\chromedriver.exe");
			chrome=new ChromeDriver();
			chrome.get("https://www.amazon.in/");
			
		}
	
		void verifyHomepage()
		{
			String expectedPageTitle = "Amazon Shopping";
			String actPageTitle = chrome.getTitle();
			System.out.println(actPageTitle);
			
			if(actPageTitle.equals(expectedPageTitle))
			{
				System.out.println("HomePage Verified");
			}
			else
			{
				System.out.println("Invalid Page ");
			}
			
	
		void verifyLoginPage()
		{
			WebElement loginLabel=chrome.findElement(By.cssSelector("lable[for=ap_email]"));
		
			boolean label=loginLabel.isDisplayed();
			if(label==true){
		
			String actLabel=loginLabel.getText();
			if(actLabel.equals("Email"))
		System.out.println("Label Matched");
			else
				System.out.println("Label unmatched");
		}
		}
		void Price()
		{
			WebElement PriceLabel=chrome.findElement(By.cssSelector("lable[Price]"));
		
			boolean label=PriceLabel.isDisplayed();
			if(label==true){
		
			String actLabel=PriceLabel.getText();
			if(actLabel.equals("Price"))
		System.out.println("Price is high");
			else
				System.out.println("Price is low ");
		}
		}

		void verifyLogout()
		{
			WebElement logout=chrome.findElement(By.cssSelector("lable[for=ap_email]"));
		
			boolean label=logout.isDisplayed();
			if(label==true){
		
			String actLabel=logout.getText();
			if(actLabel.equals("Email"))
		System.out.println("Label Matched");
			else
				System.out.println("Label unmatched");
		}
		}
		static void signin()
		{
			
		}
		void closeBrowser()
		{

		}
		public static void main(String[] args) throws Exception {
			
			Amazon a=new Amazon();
			a.visitamazon();
			a.testcase
			a.signin();
			a.logout();
			a.verifyHomepage();
		

	}

		private static void void() {
			// TODO Auto-generated method stub
			
		}
	}


