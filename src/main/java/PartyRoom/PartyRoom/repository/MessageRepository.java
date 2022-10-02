package PartyRoom.PartyRoom.repository;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Client;
import PartyRoom.PartyRoom.entities.Message;
import PartyRoom.PartyRoom.repository.crudRepository.CategoryCrudRepository;
import PartyRoom.PartyRoom.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){

        return (List<Message>) messageCrudRepository.findAll();
    }
    public Optional<Message> getMessage(Integer idMessage){

        return messageCrudRepository.findById(idMessage);
    }
    public Message save(Message m){

        return messageCrudRepository.save(m);
    }
    public void delete(Message m){

        messageCrudRepository.delete(m);
    }
}
