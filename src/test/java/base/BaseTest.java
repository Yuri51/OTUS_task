package base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.*;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
  protected WebDriver driver = CommonActions.createDriver();
  protected BasePage basePage = new BasePage(driver);
  protected EconomyPage economyPage = new EconomyPage(driver);
  protected PoliticsPage politicsPage = new PoliticsPage(driver);
  protected SocietyPage societyPage = new SocietyPage(driver);
  protected WorldPage worldPage = new WorldPage(driver);
  protected IncidentsPage incidentsPage = new IncidentsPage(driver);
  protected MainPage mainPage = new MainPage(driver);


  @AfterSuite(alwaysRun = true)
  public void close() {
    if (HOLD_BROWSER_OPEN) {
      driver.quit();
    }
  }
}

