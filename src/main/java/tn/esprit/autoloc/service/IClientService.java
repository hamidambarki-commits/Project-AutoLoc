package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface IClientService {
    Client addclient(Client c);

    Client updateclient(Client c);

    Client deleteclient(Long id);

    List<Client> allclient();
}
