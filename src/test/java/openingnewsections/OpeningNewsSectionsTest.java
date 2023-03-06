package openingnewsections;

import base.BaseTest;
import org.testng.annotations.Test;

import static constants.Constants.urls.RIO_HOME_PAGE;

public class OpeningNewsSectionsTest extends BaseTest {

  @Test
  public void openingPoliticsSectionTest() {
    basePage.open(RIO_HOME_PAGE);
    mainPage.clickSectionPoliticsPage();
    politicsPage.titleDisplay();
  }

  @Test
  public void openingWorldSectionTest() {
    basePage.open(RIO_HOME_PAGE);
    mainPage.clickSectionWorldPage();
    worldPage.titleDisplay();
  }

  @Test
  public void openingEconomySectionTest() {
    basePage.open(RIO_HOME_PAGE);
    mainPage.clickSectionEconomyPage();
    economyPage.titleDisplay();
  }

  @Test
  public void openingSocietySectionTest() {
    basePage.open(RIO_HOME_PAGE);
    mainPage.clickSectionSocietyPage();
    societyPage.titleDisplay();
  }

  @Test
  public void openingIncidentsSectionTest(){
    basePage.open(RIO_HOME_PAGE);
    mainPage.clickSectionIncidentsPage();
    incidentsPage.titleDisplay();
  }
}

