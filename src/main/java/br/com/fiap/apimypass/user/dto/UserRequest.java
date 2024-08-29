package br.com.fiap.apimypass.user.dto;

import br.com.fiap.apimypass.user.User;

public record UserRequest(
        String username,
        String password
) {
    public User toModel() {
        return User.builder()
                .username(username)
                .password(password)
                .build();
    }
}