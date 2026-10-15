package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance addmaintenance(Maintenance m);

    Maintenance updatemaintenance(Maintenance m);

    Maintenance deletemaintenance(Long id);

    List<Maintenance> allmaintenance();
}

