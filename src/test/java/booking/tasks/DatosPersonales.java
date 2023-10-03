import booking.interfaces.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.hamcrest.Matchers.containsString;

public class DatosPersonales implements Task {




    @Override
    @Step("{0} fill in your info")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Persona.INPUT_FIRST_NAME, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(Persona.INPUT_FIRST_NAME),
                Enter.theValue("Primer Nombre").into(Persona.INPUT_FIRST_NAME),

                Click.on(Persona.INPUT_LAST_NAME),
                Enter.theValue("Apellido").into(Persona.INPUT_LAST_NAME),

                Click.on(Persona.INPUT_EMAIL_ADDRESS),
                Enter.theValue("Direccion").into(Persona.INPUT_EMAIL_ADDRESS),
                theActorHidesKeyboard(),

                Click.on(Persona.INPUT_ADDRESS),
                Enter.theValue("direccion").into(Persona.INPUT_ADDRESS),
                theActorHidesKeyboard(),

                Click.on(Persona.INPUT_ZIP_CODE),
                Enter.theValue("144").into(Persona.INPUT_ZIP_CODE),
                theActorHidesKeyboard(),

                Click.on(Persona.INPUT_CITY),
                Enter.theValue("ciudad").into(Persona.INPUT_CITY),
                theActorHidesKeyboard(),

                Click.on(Persona.INPUT_COUNTRY),
                Clear.field(Persona.INPUT_COUNTRY),
                Enter.theValue("Peru").into(Persona.INPUT_COUNTRY),
                theActorHidesKeyboard(),

                Click.on(Persona.INPUT_MOBILE_PHONE),
                Clear.field(Persona.INPUT_MOBILE_PHONE),
                Enter.theValue("936734521").into(Persona.INPUT_MOBILE_PHONE),
                theActorHidesKeyboard(),


                Click.on(Persona.RADIO_BTN_LEISURE)
        );

        actor.attemptsTo(Click.on(Persona.BTN_NEXT_STEP));
    }

    private Performable theActorHidesKeyboard() {

        return null;
    }
}