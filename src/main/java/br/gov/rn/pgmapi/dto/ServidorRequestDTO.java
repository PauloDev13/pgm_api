package br.gov.rn.pgmapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.Set;

public record ServidorRequestDTO (
        @NotBlank @Size(max = 150)
        String nome,

        @NotBlank @Size(max = 50)
        String matricula,

        @NotBlank @CPF @Size(min = 11, max = 11)
        String cpf,
        LocalDate dataNascimento,
        String genero,
        String telefone,

        @Email @NotBlank
        String emailPessoal,

        @Email @NotBlank
        String emailInstitucional,
        String endereco,
        String filiacao,
        LocalDate dataDesligamento,
        Long cargoId,
        Long setorId,
        Long statusId,
        Long vinculoId,
        Long lotacaoId,
        Set<Long> sistemasIds,
        Set<Long> procuradoresIds,
        Set<Long> aliasesIds
){}
