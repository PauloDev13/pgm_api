package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Vinculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinculoRepository extends JpaRepository<Vinculo, Integer> {}
