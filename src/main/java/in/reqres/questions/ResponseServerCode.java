package in.reqres.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseServerCode implements Question<Object> {
    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }
    public static Question<Object> was(){
        return new ResponseServerCode();
    }
}
