package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorldPage {
  protected WebDriver driver;

  public WorldPage(WebDriver driver) {
    this.driver = driver;
  }

  By nameWorldPage = By.xpath("//span[@data-sid='world']");

  public WorldPage titleDisplay() {
    driver.findElement(nameWorldPage);
    return this;
  }
}

