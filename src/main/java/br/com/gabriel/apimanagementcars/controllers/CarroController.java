package br.com.gabriel.apimanagementcars.controllers;

import br.com.gabriel.apimanagementcars.models.Carro;
import br.com.gabriel.apimanagementcars.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {
    @Autowired
    private CarroService carroService;
    @PostMapping
    public ResponseEntity<?> createCarro (@RequestBody Carro carro){
        carro = carroService.create(carro);
        //return ResponseEntity.ok().body(carro);
        return new ResponseEntity( carro,HttpStatus.CREATED);
    }



}
