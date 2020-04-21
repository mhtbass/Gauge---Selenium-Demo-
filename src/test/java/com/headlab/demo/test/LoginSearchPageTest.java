package com.headlab.demo.test;

import com.headlab.demo.base.BaseTest;
import com.headlab.demo.page.LoginSearchPage;
import com.thoughtworks.gauge.Step;

public class LoginSearchPageTest extends BaseTest {

    LoginSearchPage loginSearchPage;

    @Step({"Ana sayfa açılır"})
    public void before() {
        loginSearchPage = new LoginSearchPage(getDriver());
    }

    @Step({"Çerez uyarısı kapatılır"})
    public void closeCookies (){
        loginSearchPage.closeCookies();
    }

    @Step({"Giriş yap butonuna tıklanır"})
    public void hoverProfileandClick (){
        loginSearchPage.hoverProfileandClick();
    }

    @Step({"Email girilir <email>"})
    public void enterEmail (String email){
        loginSearchPage.enterEmail(email);
    }

    @Step({"Şifre girilir <pass>"})
    public void enterPass (String pass){
        loginSearchPage.enterPass(pass);
    }

    @Step({"Giriş yapılır"})
    public void clickLogin (){
        loginSearchPage.clickLogin();
    }

    @Step({"Promosyon uyarısı kapatılır"})
    public void closePromo () throws InterruptedException {
        loginSearchPage.closePromo();
        Thread.sleep(1000);
    }

    @Step({"Arama alanına <search> yazılır"})
    public void clickLogin (String search){
        loginSearchPage.search(search);
    }

    @Step({"Arama iconuna tıklanır"})
    public void clickSearch (){
        loginSearchPage.clickSearch();
    }

    @Step({"6. ürüne tıklanır"})
    public void clickRandomProduct (){
        loginSearchPage.clickProduct();
    }

    @Step({"Ürünü sepete ekle"})
    public void addToBasket (){
        loginSearchPage.clickBasket();
    }

}
