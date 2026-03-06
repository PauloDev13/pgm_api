package br.gov.rn.pgmapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "servidor")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    private String endereco;

    private String filiacao;

    @Column(name = "data_desligamento")
    private LocalDate dataDesligamento;

    // Relacionamentos N:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "setor_id")
    private Setor setor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private Setor status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vinculo_id")
    private Setor vinculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lotacao_id")
    private Setor lotacao;

    // Relacionamentos N:N (Tabelas de Junção gerenciadas pelo Hibernate)
    @ManyToMany
    @JoinTable(
            name = "servidor_sistema",
            joinColumns = @JoinColumn(name = "servidor_id"),
            inverseJoinColumns = @JoinColumn(name = "sistema_id")
    )
    private Set<Sistema> sistemas; // Assumindo classe Sistema

    @ManyToMany
    @JoinTable(
            name = "servidor_procurador",
            joinColumns = @JoinColumn(name = "servidor_id"),
            inverseJoinColumns = @JoinColumn(name = "procurador_id")
    )
    private Set<Procurador> procuradores;

    @ManyToMany
    @JoinTable(
            name = "servidor_alias",
            joinColumns = @JoinColumn(name = "servidor_id"),
            inverseJoinColumns = @JoinColumn(name = "alias_id")
    )
    private Set<Procurador> aliases;
}