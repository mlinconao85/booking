package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import booking.interfaces.HomeViewer;

public class DatosViaje implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                Click.on(HomeViewer.persons),
                Click.on(HomeViewer.aply),
                Click.on(HomeViewer.search)

        );

    }



}
