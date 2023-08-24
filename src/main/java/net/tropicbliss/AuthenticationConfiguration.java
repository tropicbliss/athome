package net.tropicbliss;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("authentication")
public class AuthenticationConfiguration {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}