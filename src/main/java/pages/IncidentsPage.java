package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncidentsPage {
  protected WebDriver driver;

  public IncidentsPage(WebDriver driver) {
    this.driver = driver;
  }

  By nameIncidentsPage = By.xpath("//span[@data-sid='incidents']");

  public IncidentsPage titleDisplay() {
    driver.findElement(nameIncidentsPage);
    return this;
  }
}

