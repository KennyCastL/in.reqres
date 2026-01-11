package in.reqres.questions;

import in.reqres.models.UsuarioModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ActualizarUsuarioData implements Question<UsuarioModel> {

    @Override
    public UsuarioModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(UsuarioModel.class);
    }

    //El Metodo que sirve para interacturar con la clase
    public static ActualizarUsuarioData actualizarData (){
        return new ActualizarUsuarioData();
    }

}
