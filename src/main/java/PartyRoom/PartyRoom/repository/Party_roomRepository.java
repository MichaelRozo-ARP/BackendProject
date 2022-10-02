package PartyRoom.PartyRoom.repository;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Client;
import PartyRoom.PartyRoom.entities.Party_room;
import PartyRoom.PartyRoom.repository.crudRepository.Party_roomCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Party_roomRepository {

    @Autowired
    private Party_roomCrudRepository party_roomCrudRepository;

    public List<Party_room> getAll(){

        return (List<Party_room>) party_roomCrudRepository.findAll();
    }
    public Optional<Party_room> getParty_room(Integer id) {

        return party_roomCrudRepository.findById(id);
    }
    public Party_room save(Party_room pr){

        return party_roomCrudRepository.save(pr);
    }
    public void delete(Party_room pr){

        party_roomCrudRepository.delete(pr);
    }
}
