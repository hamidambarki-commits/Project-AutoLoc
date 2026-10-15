package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat addcontrat(Contrat c);

    Contrat updatecontrat(Contrat c);

    Contrat deletecontrat(Long id);

    List<Contrat> allcontrat();

}
