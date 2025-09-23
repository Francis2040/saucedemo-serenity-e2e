package com.nttdata.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPageInterface extends PageObject {
    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("login-button"));
    public static final Target PRODUCT_ITEM = Target.the("product item")
            .locatedBy("//div[@class='inventory_item'][{0}]//button");
    public static final Target SHOPPING_CART = Target.the("shopping cart")
            .located(By.className("shopping_cart_link"));
}