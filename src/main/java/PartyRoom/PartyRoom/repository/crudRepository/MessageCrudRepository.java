package PartyRoom.PartyRoom.repository.crudRepository;

import PartyRoom.PartyRoom.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
