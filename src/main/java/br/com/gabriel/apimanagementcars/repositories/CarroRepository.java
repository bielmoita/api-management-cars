package br.com.gabriel.apimanagementcars.repositories;

import br.com.gabriel.apimanagementcars.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
