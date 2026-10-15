package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiementService {


    Paiement addpaiement(Paiement p);

    Paiement updatepaiement(Paiement p);

    Paiement deletepaiement(Long id);

    List<Paiement> allpaiement();

}
