package PartyRoom.PartyRoom.repository.crudRepository;

import PartyRoom.PartyRoom.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}
