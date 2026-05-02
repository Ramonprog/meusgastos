package com.example.meusgastos.dto.user;

import java.util.Date;

public record UserResponseDto(
                String id,
                String name,
                String email,
                Date disabledData,
                String photoUrl) {
}
