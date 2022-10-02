package PartyRoom.PartyRoom.service;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Client;
import PartyRoom.PartyRoom.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){

        return clientRepository.getAll();
    }
    public Optional<Client> getClient(int idClient){

        return clientRepository.getClient(idClient);
    }
    public Client save(Client c){
        if(c.getIdClient()==null){
            return clientRepository.save(c);
        }else{
            Optional<Client> e = clientRepository.getClient(c.getIdClient());
            if(e.isPresent()){
                return c;
            }else{
                return clientRepository.save(c);
            }
        }
    }
    public Client update(Client c){
        if(c.getIdClient()!=null){
            Optional<Client> q = clientRepository.getClient(c.getIdClient());
            if(q.isPresent()){
                if(c.getClientName()!=null){
                    q.get().setClientName(c.getClientName());
                }
                if(c.getClientEmail()!=null){
                    q.get().setClientEmail(c.getClientEmail());
                }
                if(c.getClientAge()!=null){
                    q.get().setClientAge(c.getClientAge());
                }
                if(c.getPassword()!=null){
                    q.get().setPassword(c.getPassword());
                }
                clientRepository.save(q.get());
                return q.get();
            }else{
                return c;
            }
        }else{
            return c;
        }
    }
    public boolean delete(int idClient){
        boolean flag=false;
        Optional<Client>c= clientRepository.getClient(idClient);
        if(c.isPresent()) {
            clientRepository.delete(c.get());
            flag = true;
        }
        return flag;
    }
}
