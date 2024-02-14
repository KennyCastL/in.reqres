package in.reqres.stepDefinitions;

import in.reqres.constants.Constants;
import in.reqres.tasks.EliminarUsuarioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.reports.json.gson.GsonJSONConverter;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class EliminarUsuarioStepDefinitions {

    private String restBaseUrl;
    private EnvironmentVariables environmentVariables;
    private Actor user;

    @Before
    public void setUp() {
        // Especificar la ruta
        restBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse(Constants.getUrlBaseUser());

        user = Actor.named("user").whoCan(CallAnApi.at(restBaseUrl));
    }

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
                        rest -> rest.statusCode(int1)
                )

        );
    }


}
