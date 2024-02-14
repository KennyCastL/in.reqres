package in.reqres.constants;

import lombok.Data;

@Data
public class Constants {
    private static final String URL_BASE_USER = "https://reqres.in";
    private static final String GET_USERS = "/api/users?page=2";
    private static final String POST_USER = "/api/users";
    private static final String PUT_USER = "/api/users/1"; //Este ID debe ser una variable
    private static final String DEL_USER = "/api/users/2";


    public static String getUrlBaseUser() {
        return URL_BASE_USER;
    }

    public static String getPostUser() {
        return POST_USER;
    }

    public static String getPutUser() {
        return PUT_USER;
    }

    public static String getGetUsers() {
        return GET_USERS;
    }

    public static String getDelUser() {
        return DEL_USER;
    }
}
