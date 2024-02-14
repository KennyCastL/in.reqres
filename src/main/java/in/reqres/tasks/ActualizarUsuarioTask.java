package in.reqres.tasks;

import in.reqres.constants.Constants;
import in.reqres.questions.ActualizarUsuarioData;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ActualizarUsuarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Put.to(Constants.getPutUser())
                        .with(
                                requestSpecification -> requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body(
                                                actor.asksFor(ActualizarUsuarioData.actualizarData())
                                        )
                                        .log()
                                        .all()
                        )
        );
    }

    public static ActualizarUsuarioTask actualizarUsuario() {
        return instrumented(ActualizarUsuarioTask.class);
    }

}
