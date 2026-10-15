package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

public class AgenceService implements IAgenceService {

public AgenceRepository agencerepo ;   @Override
    public Agence addagence(Agence a) {
        return agencerepo.save(a);
    }
    @Override
    public Agence updateagence(Agence a) {
        return agencerepo.save(a);
    }

    @Override
    public Agence deleteagence(Long id) {
        Agence a = agencerepo.findById(id).get();
        agencerepo.deleteById(id);
        return a;
    }

    @Override
    public List<Agence> allagence() {
        return agencerepo.findAll();
    }
}
