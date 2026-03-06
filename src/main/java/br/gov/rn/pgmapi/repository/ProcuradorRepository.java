package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Procurador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcuradorRepository extends JpaRepository<Procurador, Integer> {}
