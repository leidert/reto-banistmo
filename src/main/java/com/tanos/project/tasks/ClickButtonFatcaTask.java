package com.tanos.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.tanos.project.userinterfaces.HomePageUi.*;

@AllArgsConstructor
public class ClickButtonFatcaTask implements Task {

    public static ClickButtonFatcaTask clickButtonFatca(){
        return Tasks.instrumented(ClickButtonFatcaTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BUTTON_FATCA));
        actor.attemptsTo(Click.on(BUTTON_FATCA).afterWaitingUntilEnabled());
    }
}
