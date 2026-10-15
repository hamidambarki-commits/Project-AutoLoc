package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

public class ClientService implements IClientService {

    public ClientRepository clientrepo;


    @Override
    public Client addclient(Client c) {
        return clientrepo.save(c);
    }


    @Override
    public Client updateclient(Client c) {
        return clientrepo.save(c);
    }

    @Override
    public Client deleteclient(Long id) {
        Client c = clientrepo.findById(id).get();
        clientrepo.deleteById(id);
        return c;
    }


    @Override
    public List<Client> allclient() {
        return clientrepo.findAll();
    }










}
