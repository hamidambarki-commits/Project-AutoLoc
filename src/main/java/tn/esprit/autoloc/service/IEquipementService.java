package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {


    Equipement addequipement(Equipement e);

    Equipement updateequipement(Equipement e);

    Equipement deleteequipement(Long id);

    List<Equipement> allequipement();
}
