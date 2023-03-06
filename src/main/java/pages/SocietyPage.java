package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocietyPage {
  protected WebDriver driver;

  public SocietyPage(WebDriver driver) {
    this.driver = driver;
  }

  By nameSocietyPage = By.xpath("//span[@data-sid='society']");

  public SocietyPage titleDisplay() {
    driver.findElement(nameSocietyPage);
    return this;
  }
}

