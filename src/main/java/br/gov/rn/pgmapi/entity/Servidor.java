package br.gov.rn.pgmapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "servidor")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, unique = true, length = 50)
    private String matricula;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(length = 20)
    private String genero;

    @Column(length = 20)
    private String telefone;

    @Column(name = "email_pessoal", length = 100)
    private String emailPessoal;

    @Column(name = "email_institucional", length = 100)
    private String emailInstitucional;

    @Column(length = 255)
    private String endereco;

    @Column(length = 255)
    private String filiacao;

    @Column(name = "data_desligamento")
    private LocalDate dataDesligamento;

    // Relacionamentos N:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
}