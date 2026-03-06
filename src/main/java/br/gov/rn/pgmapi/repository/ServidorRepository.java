package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, Integer> {
    boolean existsByCpf(String cpf);
    boolean existsByMatricula(String matricula);
}
