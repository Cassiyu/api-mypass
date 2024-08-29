package br.com.fiap.apimypass.user.dto;

import br.com.fiap.apimypass.user.User;

public record UserResponse (
        Long id,
        String name
) {
    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getUsername()
        );
    }
}