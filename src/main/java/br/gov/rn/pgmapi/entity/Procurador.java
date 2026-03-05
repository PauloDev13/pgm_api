package br.gov.rn.pgmapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "procurador")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Procurador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;
}