package api.config;

public class ApiUserConfig {
    public static String host="https://todo.ly";
    public static String user="luis_segundo_parcial@gmail.com";
    public static String pwd="12345678";

    public static final String CREATE_USER=host+"/api/user.json";
    public static final String READ_USER=host+"/api/user.json";
    public static final String UPDATE_USER=host+"/api/user/{id}.json";
    public static final String DELETE_USER=host+"/api/user/{id}.json";

}
