package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Setor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer> {}
