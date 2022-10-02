package PartyRoom.PartyRoom.controller;


import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Party_room;
import PartyRoom.PartyRoom.service.CategoryService;
import PartyRoom.PartyRoom.service.Party_roomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Partyroom")
public class Party_roomController {

    @Autowired
    private Party_roomService party_roomService;

    @GetMapping("/all")
    public List<Party_room> getAll(){
        return party_roomService.getAll();
    }

    @PostMapping("/save")
    public Party_room save(@RequestBody Party_room p){
        return party_roomService.save(p);
    }

}
