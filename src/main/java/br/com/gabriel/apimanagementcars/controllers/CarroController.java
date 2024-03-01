package br.com.gabriel.apimanagementcars.controllers;

import br.com.gabriel.apimanagementcars.models.Carro;
import br.com.gabriel.apimanagementcars.services.CarroService;
import br.com.gabriel.apimanagementcars.utils.StatusCarEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarroController {
    @Autowired
    private CarroService carroService;

    //Cadastrar Carro
    @PostMapping
    public ResponseEntity<?> createCarro (@RequestBody Carro carro){
        carro = carroService.create(carro);
        //return ResponseEntity.ok().body(carro);
        return new ResponseEntity( carro,HttpStatus.CREATED);
    }

    //Listar Carros
    @GetMapping
    public ResponseEntity<?> listarCarros(){
        List<Carro> carros = carroService.listarCarros();
        return !carros.isEmpty() ? ResponseEntity.ok(carros) : ResponseEntity.noContent().build();
    }

    //Ver Detalhes
    @GetMapping("/{id}")
    public ResponseEntity<Carro> verDetalhes(@PathVariable long id){
        Carro carro = carroService.verDetalhes(id);
        return new ResponseEntity( carro, HttpStatus.FOUND);
        //return carroService.verDetalhes(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
        //Optional<Carro> carro = carroService.verDetalhes(id);
        //return carro.isPresent() ? ResponseEntity.of(carro) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    //Trocar Status
    @PutMapping("/{id}/{status}")
    public ResponseEntity<Carro> trocarStatus(@PathVariable long id, @PathVariable StatusCarEnum status){
        boolean statusTrocado = carroService.trocarStatus(id, status);
        return new ResponseEntity("",(statusTrocado ? HttpStatus.OK : HttpStatus.BAD_REQUEST) );
    }

    //Delecao Logica
    @DeleteMapping("/{id}")
    public ResponseEntity<Carro> delecaoLogica(@PathVariable long id){
        boolean delecaoLogica = carroService.delecaoLogica(id);
        return new ResponseEntity(delecaoLogica, HttpStatus.OK);
    }

}
