package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repository.PaiementRepository;

import java.util.List;

public class PaiementService implements IPaiementService{


    public PaiementRepository paiementrepo;


    @Override
    public Paiement addpaiement(Paiement p) {
        return paiementrepo.save(p);
    }


    @Override
    public Paiement updatepaiement(Paiement p) {
        return paiementrepo.save(p);
    }


    @Override
    public Paiement deletepaiement(Long id) {
        Paiement p = paiementrepo.findById(id).get();
        paiementrepo.deleteById(id);
        return p;
    }


    @Override
    public List<Paiement> allpaiement() {
        return paiementrepo.findAll();
    }
}
