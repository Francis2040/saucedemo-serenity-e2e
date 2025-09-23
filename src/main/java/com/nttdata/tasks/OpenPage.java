package com.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    private final String url;

    public OpenPage(String url) {
        this.url = url;
    }

    public static OpenPage at(String url) {
        return instrumented(OpenPage.class, url);
    }

    @Step("{0} opens the browser at #url")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}