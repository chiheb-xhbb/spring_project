package tn.fst.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.fst.tpfoyer.entity.Reservation;
import tn.fst.tpfoyer.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    private IReservationService reservationService;
    //CRUD
    // http://localhost:8089/tpfoyer/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    // http://localhost:8089/tpfoyer/reservation/retrieve-reservation/1
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(
            @PathVariable("reservation-id") Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    // http://localhost:8089/tpfoyer/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    // http://localhost:8089/tpfoyer/reservation/remove-reservation/1
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(
            @PathVariable("reservation-id") Long reservationId) {
        reservationService.removeReservation(reservationId);
    }

    // http://localhost:8089/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation reservation) {
        return reservationService.modifyReservation(reservation);
    }
}
