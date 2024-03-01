package br.com.gabriel.apimanagementcars;

import br.com.gabriel.apimanagementcars.models.Carro;
import br.com.gabriel.apimanagementcars.services.CarroService;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class CarroServiceTest {

    private CarroService carroService;



    @Test
    public void testeCarro() throws Exception{

        Carro carro = new Carro();
        carroService.create(carro);
        long id = carro.getId();
        assertEquals(1, id);


     }
}
