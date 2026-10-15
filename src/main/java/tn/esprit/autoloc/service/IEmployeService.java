package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {

    Employe addemploye(Employe e);

    Employe updateemploye(Employe e);

    Employe deleteemploye(Long id);

    List<Employe> allemploye();


}
