package br.gov.rn.pgmapi.dto;

import java.time.LocalDate;

public record ServidorResponseDTO(
        Long id,
        String nome,
        String matricula,
        String cpf,
        LocalDate dataNascimento,
        String emailPessoal,
        String emailInstitucional
){}
