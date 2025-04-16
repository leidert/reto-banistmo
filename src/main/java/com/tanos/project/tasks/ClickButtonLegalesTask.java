package com.tanos.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.tanos.project.userinterfaces.HomePageUi.BUTTON_LEGALES;

@AllArgsConstructor
public class ClickButtonLegalesTask implements Task {

    public static ClickButtonLegalesTask clickButtonLegales(){
        return Tasks.instrumented(ClickButtonLegalesTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BUTTON_LEGALES));
        actor.attemptsTo(Click.on(BUTTON_LEGALES).afterWaitingUntilPresent());
    }
}
