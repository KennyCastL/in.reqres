package in.reqres.stepDefinitions;

import in.reqres.constants.Constants;
import in.reqres.tasks.EliminarUsuarioTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class EliminarUsuarioStepDefinitions {

    Actor user = Actor.named("user")
            .whoCan(CallAnApi.at(Constants.getUrlBaseUser()));

    @Cuando("el usuario consume el endpoint  se envia el usuario a eliminar")
    public void elUsuarioConsumeElEndpointSeEnviaElUsuarioAEliminar() {
        user.attemptsTo(
                EliminarUsuarioTask.eliminarUsuario()
        );
    }

    @Entonces("el servidor debe responder status code {int}")
    public void elServidorDebeResponderStatusCode(Integer int1) {
        user.should(
                seeThatResponse(
                        validatableResponse -> validatableResponse.statusCode(int1)
                )
        );
    }



}
