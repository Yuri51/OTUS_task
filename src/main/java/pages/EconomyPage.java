package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EconomyPage {
  protected WebDriver driver;

  public EconomyPage(WebDriver driver) {
    this.driver = driver;
  }

  By nameEconomyPage = By.xpath("//span[@data-sid='economy']");

  public EconomyPage titleDisplay() {
    driver.findElement(nameEconomyPage);
    return this;
  }
}

