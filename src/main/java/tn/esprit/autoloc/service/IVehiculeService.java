package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule addvehicule(Vehicule v);

    Vehicule updatevehicule(Vehicule v);

    Vehicule deletevehicule(Long id);

    List<Vehicule> allvehicule();
}
