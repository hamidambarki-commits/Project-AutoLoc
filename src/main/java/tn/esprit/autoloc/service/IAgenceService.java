package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;



public interface IAgenceService {
    Agence  addagence(Agence a);
    Agence  updateagence(Agence a);
    Agence  deleteagence(Long id);

   List <Agence>  allagence( );





}
