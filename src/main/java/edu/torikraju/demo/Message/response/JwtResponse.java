package edu.torikraju.demo.Message.response;

import edu.torikraju.demo.Models.Role;
import edu.torikraju.demo.Models.User;

import java.util.ArrayList;
import java.util.List;

public class JwtResponse {

    private String token;
    private String type = "Bearer";
    private List<String> roles;
    private String username;
    private Long id;

    public JwtResponse(String token, User user) {
        this.token = token;
        this.id = user.getId();
        this.username = user.getUsername();
        this.roles = getUserRoles(user);
    }

    private List<String> getUserRoles(User user) {
        List<String> copy = new ArrayList<String>();

        for (Role r : user.getRoles()) {
            copy.add(String.valueOf(r.getName()));
        }
        return copy;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }


    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
