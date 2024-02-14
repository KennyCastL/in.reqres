package in.reqres.stepDefinitions;

import in.reqres.questions.ResponseServerCode;
import in.reqres.tasks.CrearUsuarioTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static in.reqres.constants.Constants.getUrlBaseUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CrearUsuarioStepDefinitions {

    Actor user = Actor.named("user")
            .whoCan(CallAnApi.at(getUrlBaseUser()));

    @Cuando("el usuario consume el endpoint se envia la informacion")
    public void elUsuarioConsumeElEndpointSeEnviaLaInformacion() {

        user.attemptsTo(
                CrearUsuarioTask.crearUsuario()
        );
    }

    @Entonces("responde status code {int}")
    public void respondeStatusCode(Integer int1) {
        user.should(
                seeThat(
                        ResponseServerCode.was(),
                        equalTo(int1)
                )
        );
    }

}
