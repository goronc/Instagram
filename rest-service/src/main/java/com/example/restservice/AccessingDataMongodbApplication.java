package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

  @Autowired
  private CommentaireRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataMongodbApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of customers
    repository.save(new Commentaire(123, 0, "UtilisateurA", "Superbe photo!"));
    repository.save(new Commentaire(123, 20, "UtilisateurA", "Parfait!"));
    repository.save(new Commentaire(123, 1, "AmateurPhoto", "J'adore les couleurs."));
    repository.save(new Commentaire(456, 2, "NatureLover", "Magnifique paysage."));
    repository.save(new Commentaire(456, 3, "Voyageur123", "Où a été prise cette photo?"));
    repository.save(new Commentaire(789, 4, "Artiste123", "Quel bel angle de vue!"));
    repository.save(new Commentaire(789, 5, "Curieux22", "Est-ce un montage?"));
    repository.save(new Commentaire(1011, 6, "PassionnéPhoto", "Joli contraste."));
    repository.save(new Commentaire(1011, 7, "LandscapeFan", "Bravo pour cette prise de vue."));
    repository.save(new Commentaire(1314, 8, "ArtEtNature", "Les détails sont incroyables."));
    repository.save(new Commentaire(1314, 9, "PhotographeEnHerbe", "Comment avez-vous réussi cela?"));
    repository.save(new Commentaire(1516, 10, "FanDeCiel", "Ciel époustouflant!"));
    repository.save(new Commentaire(1516, 11, "NuitsEtoilées", "Quelle belle nuit étoilée."));
    repository.save(new Commentaire(1718, 12, "VoyageurDansLeTemps", "Ça me rappelle un voyage lointain."));
    repository.save(new Commentaire(1718, 13, "Exploreur77", "Ciel époustouflant!"));
    repository.save(new Commentaire(1920, 14, "VueSurMer", "J'aimerais être là-bas en ce moment."));
    repository.save(new Commentaire(1920, 15, "OcéanPhotography", "La mer est si apaisante."));
    repository.save(new Commentaire(2122, 16, "AventureExotique", "Des couleurs incroyables!"));
    repository.save(new Commentaire(2122, 17, "Trekker78", "On dirait un tableau."));
    repository.save(new Commentaire(2324, 18, "ExplorateurNature", "Quel endroit unique!"));
    repository.save(new Commentaire(2324, 19, "NatureEnchantée", "Je me sens connecté à la nature."));


    // fetch all customers
    System.out.println("Commentaire found with findAll():");
    System.out.println("-------------------------------");
    for (Commentaire commentaire : repository.findAll()) {
      System.out.println(commentaire);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Commentaire found with findByPseudo('UtilisateurA'):");
    System.out.println("--------------------------------");
    for (Commentaire commentaire : repository.findByPseudo("UtilisateurA")) {
        System.out.println(commentaire);
      }

    System.out.println("Commentaire found with findByContenu('Ciel époustouflant!'):");
    System.out.println("--------------------------------");
    for (Commentaire commentaire : repository.findByContenu("Ciel époustouflant!")) {
      System.out.println(commentaire);
    }
  }

}