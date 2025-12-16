package tn.fst.tpfoyer.service;
import tn.fst.tpfoyer.entity.Reservation;
import java.util.List;
public interface IReservationService {
    ///CRUD 
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation reservation);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
    //CAS 5
    void assignChambreToReservation(Long chambreId, Long reservationId);
    //CAS 6
    void assignEtudiantToReservation(Long etudiantId, Long reservationId);

}
