package PartyRoom.PartyRoom.controller;


import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Message;
import PartyRoom.PartyRoom.service.CategoryService;
import PartyRoom.PartyRoom.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAll(){
        return messageService.getAll();
    }

    @PostMapping("/save")
    public Message save(@RequestBody Message p){
        return messageService.save(p);
    }

}
