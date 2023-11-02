package com.emet.api.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor // Genera un constructor con 1 parámetro para cada campo de su clase
@NoArgsConstructor // Generará un constructor sin parámetros.
public class AuthResponse {
    String token;
}
