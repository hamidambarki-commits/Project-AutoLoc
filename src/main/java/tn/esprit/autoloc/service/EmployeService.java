package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

public class EmployeService implements IEmployeService {


    public EmployeRepository employerepo;


    @Override
    public Employe addemploye(Employe e) {
        return employerepo.save(e);
    }


    @Override
    public Employe updateemploye(Employe e) {
        return employerepo.save(e);
    }
    @Override
    public Employe deleteemploye(Long id) {
        Employe e = employerepo.findById(id).get();
        employerepo.deleteById(id);
        return e;
    }

    @Override
    public List<Employe> allemploye() {
        return employerepo.findAll();
    }












}
