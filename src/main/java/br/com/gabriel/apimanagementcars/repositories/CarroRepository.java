package br.com.gabriel.apimanagementcars.repositories;

import br.com.gabriel.apimanagementcars.models.Carro;
import br.com.gabriel.apimanagementcars.utils.StatusCarEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> findByManufacturerIgnoreCase(String manufacturer);
    List<Carro> findByNameIgnoreCase(String name);
    List<Carro> findByYear(int year);

}
