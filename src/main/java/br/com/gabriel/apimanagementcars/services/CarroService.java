package br.com.gabriel.apimanagementcars.services;

import br.com.gabriel.apimanagementcars.models.Carro;
import br.com.gabriel.apimanagementcars.repositories.CarroRepository;
import br.com.gabriel.apimanagementcars.services.exceptions.ObjectNotFoundException;
import br.com.gabriel.apimanagementcars.utils.StatusCarEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {
    @Autowired
    private CarroRepository repo;

    public Carro create(Carro carro){
        return repo.save(carro);
    }

    public List<Carro> listarCarros(){
        //Optional<List<Carro>> listaCarros = repo.findAll();

        return repo.findAll();
    }

    public Carro verDetalhes (long id){
        Optional<Carro> verDetalhe = repo.findById(id);
        return verDetalhe.orElseThrow(()-> new ObjectNotFoundException("Carro nao encontrado por esse ID"));
    }

    public boolean trocarStatus(long id, StatusCarEnum status){
        Optional<Carro> verDetalhe = repo.findById(id);
        if(verDetalhe.isEmpty()){
            return false;
        }
        Carro mudarStatus = verDetalhe.get();
        mudarStatus.setStatus(status);
        repo.save(mudarStatus);
        return true;
    }

    public boolean delecaoLogica(long id){
        Optional<Carro> verDetalhe = repo.findById(id);
        if(verDetalhe.isEmpty()){
            return false;
        }
        Carro mudarStatus = verDetalhe.get();
        mudarStatus.setStatus(StatusCarEnum.DEACTIVATED);
        repo.save(mudarStatus);
        return true;
    }
}
