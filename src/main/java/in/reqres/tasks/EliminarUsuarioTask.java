package in.reqres.tasks;

import in.reqres.constants.Constants;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarUsuarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(Constants.getDelUser()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)

                )
        );
    }

    public static EliminarUsuarioTask eliminarUsuario() {
        return instrumented(EliminarUsuarioTask.class);
    }
}
