package PartyRoom.PartyRoom.controller;


import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Reservation;
import PartyRoom.PartyRoom.service.CategoryService;
import PartyRoom.PartyRoom.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }

}
