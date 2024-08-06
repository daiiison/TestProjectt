package Tests;

import Pages.ComputerPage;
import Pages.HomePage;
import Pages.IPhonePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForHome extends TestInit{

    @Test
    public void hotlineSearch(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHome();
        homePage.getSearchField().sendKeys("Lenovo");
        Assert.assertTrue(true);
    }
    @Test
    public void hotlineTheme(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHome();
        homePage.getThemeToggle().click();
        Assert.assertTrue(true);
    }
    @Test
    public void hotlineFooter(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHome();
        Assert.assertTrue(homePage.getFooter().isDisplayed());
    }
//    @Test
//    public void hotlineCompsBreadcrumbs(){
//        ComputerPage computerPage = new ComputerPage(driver);
//        computerPage.navigateComputer();
//        Assert.assertTrue(computerPage.getBreadcrumbs().isDisplayed());
//    }
//    @Test
//    public void hotlineCompsSidebar(){
//        ComputerPage computerPage = new ComputerPage(driver);
//        computerPage.navigateComputer();
//        Assert.assertTrue(computerPage.getSidebar().isDisplayed());
//    }
//    @Test
//    public void hotlineCompsLaptopCont(){
//        ComputerPage computerPage = new ComputerPage(driver);
//        computerPage.navigateComputer();
//        Assert.assertTrue(computerPage.getLaptopsContainer().isDisplayed());
//    }
//    @Test
//    public void hotlinePhoneAbout(){
//        IPhonePage iPhonePage = new IPhonePage(driver);
//        iPhonePage.navigateIphone();
//        Assert.assertTrue(iPhonePage.getAboutProdBtn().isDisplayed());
//    }
//    @Test
//    public void hotlinePhoneCompare(){
//        IPhonePage iPhonePage = new IPhonePage(driver);
//        iPhonePage.navigateIphone();
//        Assert.assertTrue(iPhonePage.getCompareBtn().isDisplayed());
//    }
//    @Test
//    public void hotlinePhoneAll(){
//        IPhonePage iPhonePage = new IPhonePage(driver);
//        iPhonePage.navigateIphone();
//        iPhonePage.getPersonalListBtn().click();
//        Assert.assertTrue(true);
//    }
}
