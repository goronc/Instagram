package com.example.restservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentaireRepository extends MongoRepository<Commentaire, String> {

  public List<Commentaire> findByPseudo(String pseudo);
  public List<Commentaire> findByContenu(String contenu);

}
