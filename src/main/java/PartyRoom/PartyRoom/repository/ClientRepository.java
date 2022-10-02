package PartyRoom.PartyRoom.repository;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Client;
import PartyRoom.PartyRoom.repository.crudRepository.CategoryCrudRepository;
import PartyRoom.PartyRoom.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){

        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(Integer idClient){

        return clientCrudRepository.findById(idClient);
    }
    public Client save(Client c){

        return clientCrudRepository.save(c);
    }
    public void delete(Client c){
        clientCrudRepository.delete(c);
    }
}
