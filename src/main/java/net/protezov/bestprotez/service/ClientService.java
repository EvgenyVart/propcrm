package net.protezov.bestprotez.service;

import net.protezov.bestprotez.entity.Client;
import net.protezov.bestprotez.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {

    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Client> findAll(){
        return (List<Client>)repository.findAll();
    }

    public Client saveClient(Client client){
        return repository.save(client);
    }

    public void deleteClient(Client client){
        repository.delete(client);
    }
}
