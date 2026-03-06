package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Lotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotacaoRepository extends JpaRepository<Lotacao, Integer> {}
