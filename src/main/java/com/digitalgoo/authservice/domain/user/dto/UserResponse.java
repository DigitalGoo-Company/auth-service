package com.digitalgoo.authservice.domain.user.dto;

import java.time.Instant;

public record UserResponse(
        String id,
        String firstName,
        String lastName,
        String email,
        String phone,
        String avatar,
        Instant createdAt,
        Instant updatedAt
) {
}
