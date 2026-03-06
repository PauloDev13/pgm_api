package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {}
