package com.iselect.webtest.tempalte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class IB2FlowChart {

	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		// And now use this to visit Google
		String address = "localhost:8067";
		address = "http://" + address + "/ib2/Login_prepare.action";
		// address = "http://virage/ib2/pages/Login_prepare.action";
		driver.manage().window().maximize();
		driver.get(address);

		// Find the text input element by its name
		WebElement username = driver.findElement(By.id("loginForm_login"));

		// Enter something to search for
		username.sendKeys("rxia");

		WebElement password = driver.findElement(By.id("loginForm_password"));

		// Enter something to search for
		password.sendKeys("Yu8809%!");

		// Now submit the form. WebDriver will find the form for us from the
		// element
		password.submit();

		//
		WebElement custid = driver.findElement(By.id("searchCustomerId0"));
		String custidStr = "12979843";
		custid.sendKeys(custidStr);
		custid.submit();
		WebElement custLink = driver.findElement(By
				.xpath("//*[@id=\"searchResults\"]/tbody/tr/td[1]/a"));
		custLink.click();
		// driver.get("http://"+address+"/ib2/InitCustomer_execute.action?id="+custid+"&isResponseReady=true");

		// driver.get("http://"+address+"/ib2/CustomerNeedsAnalysis_loadCustomerAnalysisAnswers.action?clearResults=true&isMenu=Yes");
		WebElement needAnalysis = driver.findElement(By.id("needsAnalysis"));
		needAnalysis.click();
		selectBtn("whereHearAbout", "Other");
		selectBtn("qantasFrequentFlyerMember", "No, I am not a member");
		selectBtn("whyBuyChange", "Coverage issues with current fund");
		radioBtn("hasMedicareCard-yes");
		radioBtn("coverType-myself");
		radioBtn("belowMin");
		radioBtn("rebateRequired-no");

		selectBtn("policyType", "Hospital Cover only");
		selectBtn("excessOnPolicy", "$0");

		radioBtn("privateHospitalAdmission3");
		radioBtn("pregnancy3");
		radioBtn("assistedReproductive3");
		radioBtn("cardioThoracic3");
		radioBtn("chronicRenalFailure3");
		radioBtn("majorEye3");
		radioBtn("hipKnee3");
		radioBtn("hospitalPsychiatricServicesPrograms3");
		radioBtn("rehabilitationServices3");
		radioBtn("sterilityReversals3");
		radioBtn("weightLossProcedures3");
		radioBtn("insulinPumps3");
		radioBtn("cochlearImplants3");
		radioBtn("coveredByHealthFund-yes");
		selectBtn("currentHealthFund", "GMHBA");
		WebElement submit = driver.findElement(By.id("continue"));
		submit.submit();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By
				.linkText("View Details")));

		boolean block = true;
		while (block)
			try {
				WebElement buyThisPolicy = driver.findElement(By
						.linkText("Buy This Policy"));
				buyThisPolicy.click();
				block = false;
				System.out.println("input detected");
			} catch (Exception e) {
				System.out.println("wait unitl click...");
			}

		checkBoxBtn("ndepConfirmed");
		checkBoxBtn("pphExplained");
		checkBoxBtn("excessExplained");
		checkBoxBtn("restrictedBenefitsDiscussed");
		checkBoxBtn("excludedBenefitsDiscussed");

		checkBoxBtn("continuityExplained");

		radioBtn("ambulanceExplained-yes");
		radioBtn("waitingPeriodsExplained-yes");

		selectBtn("campaignType", "No voucher requested or offered");
		WebElement submit1 = driver.findElement(By.id("continue"));
		submit1.submit();

		// WebDriverWait wait1 = new WebDriverWait(driver, 5);
		// wait1.until(ExpectedConditions.elementToBeClickable(By
		// .linkText("Personal Details")));
		checkBoxBtn("sameaddress");
		checkBoxBtnById("pro-rata-explained-dd");
		checkBoxBtnById("hbfDisclaimerChkBox");

		radioBtn("paymentType-dd");
		radioBtnByName("corrMethod");
		radioBtnByName("fundPrmoteAuthorize");
		radioBtnByName("clearanceCert");
		checkTxtBox("previousFundNumber", "1234567");
		checkTxtBox("medicareNo", "4444000000");
		checkTxtBox("financialInstitutionBranch", "cba");
		checkTxtBox("branchAddress", "aa");
		checkTxtBox("accountName", "dasdsad");
		checkTxtBox("bsb1", "062");
		checkTxtBox("bsb2", "184");
		checkTxtBox("cardNoDD", "12345678");
		selectBtn("medicareValidToMonth", "8");
		selectBtn("medicareValidToYear", "2019");

	}

	static void selectBtn(String name, String value) {
		try {
			Select select = new Select(driver.findElement(By.name(name)));
			// select.deselectAll();
			select.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void radioBtn(String id) {
		try {
			WebElement radioBtn = driver.findElement(By.id(id));
			radioBtn.click();
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

	static void radioBtnByName(String name) {
		try {
			WebElement radioBtn = driver.findElement(By.name(name));
			radioBtn.click();
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

	static void checkBoxBtn(String name) {
		try {
			WebElement elements = driver.findElement(By.name(name));
			elements.click();
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

	static void checkBoxBtnById(String id) {
		try {
			WebElement elements = driver.findElement(By.id(id));
			elements.click();
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

	static void checkTxtBox(String name, String val) {
		try {
			WebElement element = driver.findElement(By.name(name));
			element.sendKeys(val);
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

}
