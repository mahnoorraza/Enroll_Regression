package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_class {

	 WebDriver driver = null;

    public Common_class(WebDriver driver) {
    this.driver = driver;
 }

	public void Explicit_wait_elementToBeClickable(WebElement useraction, int waittime) {

		WebDriverWait wait = new WebDriverWait(driver, waittime);
		wait.until(ExpectedConditions.elementToBeClickable(useraction));


	}

	public void Explicit_wait_elementToBeClickable1(WebElement Filter, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, waittime);
		wait.until(ExpectedConditions.elementToBeClickable(Filter));

	}


	public void Implicit_wait(int waittime) {
		driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);

		}


	public void Explicit_wait_elementToVisibe(WebElement adduser, int i) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) adduser));

	}



	}









