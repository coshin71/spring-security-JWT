package hello.springsecurityJWT.jwt;

public interface JwtProperties {
    String SECRET = "coshin";
    int EXPIRATION_TIME = 60000*10;
    String TOKEN_PREFIX = "Bearer ";
    String HEADER_NAME = "Authorization";
}
