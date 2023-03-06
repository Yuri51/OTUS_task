package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
  public MainPage(WebDriver driver) {
    super(driver);
  }

  private final By politicsPage = By.xpath("//*[contains(@class,'cell-extension')][a[@href='/politics/']]");
  private final By worldPage = By.xpath("//div[contains(@class,'cell-extension')][a[@href='/world/']]");
  private final By economyPage = By.xpath("//div[contains(@class,'cell-extension')][a[@href='/economy/']]");
  private final By societyPage = By.xpath("//div[contains(@class,'cell-extension')][a[@href='/society/']]");
  private final By incidentsPage = By.xpath("//div[contains(@class,'cell-extension')][a[@href='/incidents/']]");

  public MainPage clickSectionPoliticsPage(){
    driver.findElement(politicsPage).click();
    return this;
  }
  public MainPage clickSectionWorldPage(){
    driver.findElement(worldPage).click();
    return this;
  }
  public MainPage clickSectionEconomyPage(){
    driver.findElement(economyPage).click();
    return this;
  }
  public MainPage clickSectionSocietyPage(){
    driver.findElement(societyPage).click();
    return this;
  }
  public MainPage clickSectionIncidentsPage(){
    driver.findElement(incidentsPage).click();
    return this;
  }
}
