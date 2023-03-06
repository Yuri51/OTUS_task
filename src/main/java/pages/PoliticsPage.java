package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PoliticsPage{
  protected WebDriver driver;

  public PoliticsPage(WebDriver driver) {
    this.driver = driver;
  }

  By namePoliticPage = By.xpath("//span[@data-sid='politics']");

  public PoliticsPage titleDisplay() {
    driver.findElement(namePoliticPage);
    return this;
  }

}

