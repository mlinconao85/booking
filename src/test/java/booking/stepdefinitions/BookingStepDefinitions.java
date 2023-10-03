package booking.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import booking.tasks.DatosViaje;
import booking.tasks.Login;
import booking.tasks.Search;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BookingStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("Me encuentro en dentro de la apk de Booking.com")
    public void ingresar_app() {
        theActorCalled("Juan").attemptsTo(
                new Login() );

    }
    @When("Ingreso CUSCO en el campo destino y selecciono las fechas")
    public void ingresar_datos_busqueda() {
        theActorCalled("Juan").attemptsTo(
                new Search() );

    }
    @When("Selecciono 1 habitación, 2 adultos y 1 niño de 5 años")
    public void ingresar_Criterios() {
        theActorCalled("Juan").attemptsTo(
                new DatosViaje() );

    }


}
