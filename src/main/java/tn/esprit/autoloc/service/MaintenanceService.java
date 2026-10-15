package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

import java.util.List;

public class MaintenanceService implements IMaintenanceService{



    public MaintenanceRepository maintenancerepo;


    @Override
    public Maintenance addmaintenance(Maintenance m) {
        return maintenancerepo.save(m);
    }


    @Override
    public Maintenance updatemaintenance(Maintenance m) {
        return maintenancerepo.save(m);
    }


    @Override
    public Maintenance deletemaintenance(Long id) {
        Maintenance m = maintenancerepo.findById(id).get();
        maintenancerepo.deleteById(id);
        return m;
    }


    @Override
    public List<Maintenance> allmaintenance() {
        return maintenancerepo.findAll();
    }
}
