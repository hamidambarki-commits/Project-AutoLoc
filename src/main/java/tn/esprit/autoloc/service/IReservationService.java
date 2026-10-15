package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {



    Reservation addreservation(Reservation r);

    Reservation updatereservation(Reservation r);

    Reservation deletereservation(Long id);

    List<Reservation> allreservation();
}
