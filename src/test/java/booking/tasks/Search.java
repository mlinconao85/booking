package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import booking.interfaces.HomeViewer;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(HomeViewer.campoDestino, isVisible()).forNoMoreThan(10).seconds(),

                Click.on(HomeViewer.campoDestino),
                Click.on(HomeViewer.ingresodestino),
                SendKeys.of("CUSCO").into(HomeViewer.ingresodestino),
                WaitUntil.the(HomeViewer.cuscoDestino, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeViewer.cuscoDestino),
                WaitUntil.the(HomeViewer.fecha_inicio, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeViewer.fecha_inicio),
                WaitUntil.the(HomeViewer.fecha_fin, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeViewer.fecha_fin)

        );

    }



}
