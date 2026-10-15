package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;

import java.util.List;

public class ReservationService implements IReservationService{

    public ReservationRepository reservationrepo;

    @Override
    public Reservation addreservation(Reservation r) {
        return reservationrepo.save(r);
    }


    @Override
    public Reservation updatereservation(Reservation r) {
        return reservationrepo.save(r);
    }


    @Override
    public Reservation deletereservation(Long id) {
        Reservation r = reservationrepo.findById(id).get();
        reservationrepo.deleteById(id);
        return r;
    }


    @Override
    public List<Reservation> allreservation() {
        return reservationrepo.findAll();
    }







}
