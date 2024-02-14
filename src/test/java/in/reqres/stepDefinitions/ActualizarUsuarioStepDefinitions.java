package in.reqres.stepDefinitions;

import in.reqres.constants.Constants;
import in.reqres.tasks.ActualizarUsuarioTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class ActualizarUsuarioStepDefinitions {

    Actor user = Actor.named("user")
            .whoCan(CallAnApi.at(Constants.getUrlBaseUser()));

    @Cuando("el usuario consume el endpoint  se envia la informacion para actualizar")
    public void elUsuarioConsumeElEndpointSeEnviaLaInformacionParaActualizar() {
        user.attemptsTo(
                ActualizarUsuarioTask.actualizarUsuario()
        );
    }

    @Entonces("el servidor responde status code {int}")
    public void elServidorRespondeStatusCode(Integer int1) {
        user.should(
                seeThatResponse(
                        validatableResponse -> validatableResponse.statusCode(int1)
                )
        );
    }


}
