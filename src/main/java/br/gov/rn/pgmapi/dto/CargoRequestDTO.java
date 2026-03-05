package br.gov.rn.pgmapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CargoRequestDTO(
        @NotBlank @Size(max = 100)
        String nome
){}
