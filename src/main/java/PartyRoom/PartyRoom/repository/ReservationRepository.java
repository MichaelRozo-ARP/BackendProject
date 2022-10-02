package PartyRoom.PartyRoom.repository;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Client;
import PartyRoom.PartyRoom.entities.Reservation;
import PartyRoom.PartyRoom.repository.crudRepository.CategoryCrudRepository;
import PartyRoom.PartyRoom.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){

        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(Integer idReservation){

        return reservationCrudRepository.findById(idReservation);
    }
    public Reservation save(Reservation r){

        return reservationCrudRepository.save(r);
    }
    public void delete(Reservation r){
        reservationCrudRepository.delete(r);
    }
}
