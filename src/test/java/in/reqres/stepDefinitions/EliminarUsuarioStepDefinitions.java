package in.reqres.stepDefinitions;

import in.reqres.constants.Constants;
import in.reqres.tasks.EliminarUsuarioTask;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class EliminarUsuarioStepDefinitions {

    Actor user = Actor.named("user")
            .whoCan(CallAnApi.at(Constants.getUrlBaseUser()));

    @Cuando("el usuario consume el endpoint  se envia el usuario a eliminar")
    public void elUsuarioConsumeElEndpointSeEnviaElUsuarioAEliminar() {
        user.attemptsTo(
                EliminarUsuarioTask.eliminarUsuario()
        );
    }



}
