package starter.utils;

public class Endpoint {
    public String BASE_URL = "https://demoqa.com";
    public String LOGIN = BASE_URL+"/Account/v1/User";
    public String TOKEN = BASE_URL+"/Account/v1/GenerateToken";
    public String AUTHOR = BASE_URL+"/Account/v1/Authorized";

    public char Username = (char)('A'+Math.random()*('Z'-'A'+1));
    public char Pass = (char)('A'+Math.random()*('Z'-'A'+1));
}