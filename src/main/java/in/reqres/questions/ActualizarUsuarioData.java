package in.reqres.questions;

import in.reqres.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ActualizarUsuarioData implements Question<UsuarioModel> {

    @Override
    public UsuarioModel answeredBy(Actor actor) {
        return UsuarioModel
                .builder()
                .name("Morterio Zambrano")
                .job("Paseador de Perros a domicilio")
                .build();
    }

    //El Metodo que sirve para interacturar con la clase
    public static ActualizarUsuarioData actualizarData (){
        return new ActualizarUsuarioData();
    }

}
