package PartyRoom.PartyRoom.service;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReservationService {
    @Autowired
    private ReservationService reservationRepository;

    public List<Reservation> getAll(){

        return reservationRepository.getAll();
    }
    public Optional<Reservation> getReservation(Integer idReservation){
        return reservationRepository.getReservation(idReservation);
    }
    public Reservation save(Reservation r){
        if(r.getReservationId()==null){
            return reservationRepository.save(r);
        }else{
            Optional<Reservation> e = reservationRepository.getReservation(r.getReservationId());
            if(e.isPresent()){
                return r;
            }else{
                return reservationRepository.save(r);
            }
        }
    }
    public Reservation update(Reservation r){
        if(r.getReservationId()!=null){
            Optional<Reservation> q = reservationRepository.getReservation(r.getReservationId());
            if(q.isPresent()){
                if(r.getClient()!=null){
                    q.get().setClient(r.getClient());
                }
                if(r.getStartDate()!=null){
                    q.get().setStartDate(r.getStartDate());
                }
                if(r.getDevolutionDate()!=null){
                    q.get().setDevolutionDate(r.getDevolutionDate());
                }
                reservationRepository.save(q.get());
                return q.get();
            }else{
                return r;
            }
        }else{
            return r;
        }
    }
    public boolean delete(int idReservation){
        boolean flag=false;
        Optional<Reservation>r= reservationRepository.getReservation(idReservation);
        if(r.isPresent()) {
            reservationRepository.delete(r.get().getReservationId());
            flag = true;
        }
        return flag;
    }
}
