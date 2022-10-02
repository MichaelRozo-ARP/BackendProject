package PartyRoom.PartyRoom.service;

import PartyRoom.PartyRoom.entities.Party_room;
import PartyRoom.PartyRoom.repository.Party_roomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Party_roomService {

    @Autowired
    private Party_roomRepository party_roomRepository;

    public List<Party_room> getAll(){

        return party_roomRepository.getAll();
    }
    public Optional<Party_room> getParty_room(int id){

        return party_roomRepository.getParty_room(id);
    }
    public Party_room save(Party_room p){
        if(p.getId()==null){
            return party_roomRepository.save(p);
        }else{
            Optional<Party_room> e =party_roomRepository.getParty_room(p.getId());
            if(e.isPresent()){
                return p;
            }else{
                return party_roomRepository.save(p);
            }
        }
    }
    public Party_room update(Party_room p){
        if(p.getId()!=null){
            Optional<Party_room> q =party_roomRepository.getParty_room(p.getId());
            if(q.isPresent()){
                if(p.getOwner()!=null){
                    q.get().setOwner(p.getOwner());
                }
                if(p.getCapacity()!=null){
                    q.get().setCapacity(p.getCapacity());
                }
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }
                if(p.getCategory()!=null) {
                    q.get().setCategory(p.getCategory());
                }
                party_roomRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Party_room>p=party_roomRepository.getParty_room(id);
        if(p.isPresent()) {
            party_roomRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }

}

