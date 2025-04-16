package com.tanos.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.tanos.project.userinterfaces.HomePageUi.BUTTON_COOKIES;

@AllArgsConstructor
public class ClickButtonCookiesTask implements Task {

    public static ClickButtonCookiesTask clickButtonCookies(){
        return Tasks.instrumented(ClickButtonCookiesTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_COOKIES).afterWaitingUntilPresent()) ;
    }
}
