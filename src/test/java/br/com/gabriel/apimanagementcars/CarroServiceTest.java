package br.com.gabriel.apimanagementcars;

import br.com.gabriel.apimanagementcars.models.Carro;
import br.com.gabriel.apimanagementcars.services.CarroService;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class CarroServiceTest {

    private CarroService carroService;

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void testeCarro() throws Exception{

        Carro carro = new Carro();
        string id = carro.getId();
        assertEquals(1, id);


     }
}
