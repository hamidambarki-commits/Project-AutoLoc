package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

public class EquipementService  implements IEquipementService {

    public EquipementRepository equipementrepo;









    @Override
    public Equipement addequipement(Equipement e) {
        return equipementrepo.save(e);
    }



    @Override
    public Equipement updateequipement(Equipement e) {
        return equipementrepo.save(e);
    }


    @Override
    public Equipement deleteequipement(Long id) {
        Equipement e = equipementrepo.findById(id).get();
        equipementrepo.deleteById(id);
        return e;
    }
    @Override
    public List<Equipement> allequipement() {
        return equipementrepo.findAll();
    }

}
