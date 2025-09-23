package com.nttdata.glue;

import com.nttdata.tasks.AddProductPage;
import com.nttdata.tasks.OpenPage;
import com.nttdata.userinterfaces.PurchasePageInterface;
import com.nttdata.userinterfaces.ShopPageInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginGlue {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        theActorCalled("User").attemptsTo(
                OpenPage.at("https://www.saucedemo.com/")
        );
    }

    @When("the user logs in with credentials from {string}")
    public void theUserLogsInWithCredentialsFrom(String credentialsType) {
        String username = "standard_user";
        String password = "secret_sauce";

        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(username).into(ShopPageInterface.USERNAME_FIELD),
                Enter.theValue(password).into(ShopPageInterface.PASSWORD_FIELD),
                Click.on(ShopPageInterface.LOGIN_BUTTON)
        );
    }

    @When("the user adds two products to the cart")
    public void theUserAddsTwoProductsToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductPage.withIndex(1),
                AddProductPage.withIndex(2)
        );
    }

    @When("the user views the cart")
    public void theUserViewsTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ShopPageInterface.SHOPPING_CART)
        );
    }

    @When("the user completes the purchase form with data from {string}")
    public void theUserCompletesThePurchaseFormWithDataFrom(String dataSource) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(PurchasePageInterface.CHECKOUT_BUTTON),
                Enter.theValue("John").into(PurchasePageInterface.FIRST_NAME_FIELD),
                Enter.theValue("Doe").into(PurchasePageInterface.LAST_NAME_FIELD),
                Enter.theValue("12345").into(PurchasePageInterface.POSTAL_CODE_FIELD),
                Click.on(PurchasePageInterface.CONTINUE_BUTTON),
                Click.on(PurchasePageInterface.FINISH_BUTTON)
        );
    }

    @Then("the purchase should be confirmed with the message {string}")
    public void thePurchaseShouldBeConfirmedWithTheMessage(String expectedMessage) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(Text.of(PurchasePageInterface.CONFIRMATION_MESSAGE))
                        .isEqualTo(expectedMessage)
        );
    }
}