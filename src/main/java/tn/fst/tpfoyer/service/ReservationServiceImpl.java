package tn.fst.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.fst.tpfoyer.entity.Chambre;
import tn.fst.tpfoyer.entity.Etudiant;
import tn.fst.tpfoyer.entity.Reservation;
import tn.fst.tpfoyer.repositories.ChambreRepository;
import tn.fst.tpfoyer.repositories.EtudiantRepository;
import tn.fst.tpfoyer.repositories.FoyerRepository;
import tn.fst.tpfoyer.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private FoyerRepository foyerRepository;
    private ReservationRepository reservationRepository;
    private EtudiantRepository etudiantRepository;
    private ChambreRepository chambreRepository;
    //CRUD
    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }
    @Override
    public Reservation retrieveReservation(Long reservationId) {return reservationRepository.findById(reservationId).get();}
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
    @Override
    public void removeReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }
    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
    // CAS 5
    @Override
    public void assignChambreToReservation(Long chambreId, Long reservationId) {
        Chambre chambre = chambreRepository.findById(chambreId).orElse(null);
        Reservation reservation = reservationRepository.findById(reservationId).orElse(null);

        if (chambre != null && reservation != null) {
            reservation.setChambre(chambre);
            reservationRepository.save(reservation);
        }
    }
    //CAS 6
    @Override
    public void assignEtudiantToReservation(Long etudiantId, Long reservationId) {
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Reservation reservation = reservationRepository.findById(reservationId).orElse(null);
        if (etudiant != null && reservation != null) {
            reservation.setEtudiant(etudiant);
            reservationRepository.save(reservation);
        }
    }

}
