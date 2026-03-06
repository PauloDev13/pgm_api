package br.gov.rn.pgmapi.repository;

import br.gov.rn.pgmapi.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {}
