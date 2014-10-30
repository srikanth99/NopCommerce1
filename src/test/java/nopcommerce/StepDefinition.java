package nopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by krish on 27/10/2014.
 */
public class StepDefinition {

    public WebDriver driver;

    @Before
    public void startBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://sangajala2-001-site1.smarterasp.net");
        driver.manage().window().maximize();
    }

    @After
    public void stopBrowser(){
       driver.quit();
    }


  /*  @Given("^Consumer is in shopping cart page$")
    public void Consumer_is_in_shopping_cart_page()  {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("roopaworld@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("roopakris");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
        driver.findElement(By.className("cart-label")).click();
        System.out.println("shopping cart page");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @When("^Consumer enters gift card code$")
    public void Consumer_enters_gift_card_code()  {
       driver.findElement(By.name("giftcardcouponcode")).sendKeys("09ded37d-75f3");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]/div[3]/input[2]")).click();
        System.out.println("enter code");
    }

    @Then("^Message should be displayed$")
    public void Message_should_be_displayed()  {
        String value= driver.findElement(By.className("message")).getText();
        Assert.assertEquals(value,"The gift card code was applied");
        System.out.println(value);
    }*/


    @Given("^Consumer is in login page$")
    public void Consumer_is_in_login_page()  {
        driver.findElement(By.className("ico-login")).click();

        System.out.println("loogin1");
    }

    @When("^Consumer enters user id as\"([^\"]*)\"$")
    public void Consumer_enters_user_id_as(String id)  {
        driver.findElement(By.id("Email")).sendKeys(id);
        System.out.println("logging2");
    }

    @When("^Consumer enters password as\"([^\"]*)\"$")
    public void Consumer_enters_password_as(String password)  {
        driver.findElement(By.id("Password")).sendKeys(password);

        System.out.println("loggin3");
    }

    @When("^Consumer Selects login option$")
    public void Consumer_Selects_login_option()  {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
       System.out.println("loggin4");
    }
    @Then("^Message should be displayed$")
    public void Message_should_be_displayed()  {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Welcome to our store"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Given("^Consumer is in home page$")
    public void Consumer_is_in_home_page()  {
        Assert.assertTrue(driver.findElement(By.className("ico-logout")).getText().contains("Log out"));
       System.out.println("hi");
    }

    @When("^Consumer selects 'CHERRY BOOK'$")
    public void Consumer_selects_CHERRY_BOOK() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        driver.findElement(By.linkText("CHERRY BOOK")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-button-4")).click();
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        System.out.println("selected1");
    }

    @When("^Selects 'Liju's Laptop'$")
    public void Selects_Liju_s_Laptop()  {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Liju's Laptop")).click();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-button-3")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("selected2");
    }

    @Then("^Book and laptop should be in shopping cart$")
    public void Book_and_laptop_should_be_in_shopping_cart() {
        driver.findElement(By.id("topcartlink")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("CHERRY BOOK"));
        Assert.assertTrue(driver.getPageSource().contains("Liju's Laptop"));
        System.out.println("in the shopping cart");
    }

}
