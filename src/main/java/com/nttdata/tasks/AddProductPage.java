package com.nttdata.tasks;

import com.nttdata.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductPage implements Task {
    private final int productIndex;

    public AddProductPage(int productIndex) {
        this.productIndex = productIndex;
    }

    public static AddProductPage withIndex(int productIndex) {
        return instrumented(AddProductPage.class, productIndex);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShopPageInterface.PRODUCT_ITEM.of(String.valueOf(productIndex)))
        );
    }
}