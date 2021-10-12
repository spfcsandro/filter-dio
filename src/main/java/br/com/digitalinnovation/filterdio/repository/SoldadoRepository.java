package br.com.digitalinnovation.filterdio.repository;

import br.com.digitalinnovation.filterdio.model.Soldado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldadoRepository extends JpaRepository<Soldado, Long> {
}
