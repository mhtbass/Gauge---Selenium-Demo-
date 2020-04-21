package com.headlab.demo.page;

import com.headlab.demo.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.headlab.demo.constants.Constants.*;

public class LoginSearchPage extends BasePage {

    public LoginSearchPage(WebDriver driver) {
        super(driver);
    }

    public LoginSearchPage closeCookies(){
        click(COOKIES);
        return this;
    }

    public LoginSearchPage hoverProfileandClick(){
        hoverElement(MAIN_PROFILE);
        click(LOGIN);
        return this;
    }

   public LoginSearchPage enterEmail(String product){
        sendKeys(L_EMAIL,product);
        return this;
    }

   public LoginSearchPage enterPass(String product){
        sendKeys(L_PASSWORD,product);
        return this;
    }

   public LoginSearchPage clickLogin(){
        click(L_LOGINBUTTON);
        return this;
    }

    public LoginSearchPage closePromo(){
        waitclick(PROMO);
        return this; }

   public LoginSearchPage search(String search){
        sendKeys(M_SEARCH,search);
        return this;
    }

   public LoginSearchPage clickSearch(){
        click(SEARCH_ICON);
        return this;
    }

   public LoginSearchPage clickProduct(){
        click(PRODUCT);
        return this;
    }

   public LoginSearchPage clickBasket(){
        click(BASKET);
        return this;
    }



}
