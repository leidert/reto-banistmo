package com.tanos.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static com.tanos.project.userinterfaces.HomePageUi.BUTTON_APRENDER;

@AllArgsConstructor
public class ClickButtonAprenderTask implements Task {

    public static ClickButtonAprenderTask clickButtonAprender(){
        return Tasks.instrumented(ClickButtonAprenderTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BUTTON_APRENDER));
        actor.attemptsTo(Click.on(BUTTON_APRENDER).afterWaitingUntilPresent());
    }
}
