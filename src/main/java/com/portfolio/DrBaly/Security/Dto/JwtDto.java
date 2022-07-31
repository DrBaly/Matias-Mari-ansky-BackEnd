/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.DrBaly.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class JwtDto {
    
private String Token;
private String beares = "Beares";
private String nombreUsuario;
private Collection<? extends GrantedAuthority> authorities;

    public JwtDto(String Token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.Token = Token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getBeares() {
        return beares;
    }

    public void setBeares(String beares) {
        this.beares = beares;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }


    
}
