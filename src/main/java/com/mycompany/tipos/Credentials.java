/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tipos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Lenovo
 */
public class Credentials {
    @JsonProperty("username")
    public String username;

    @JsonProperty("password")
    public String password;

    @JsonProperty("token")
    public String token;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

