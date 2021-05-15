package fr.eni.quelPokemon.bo;
/**
 * TP Pokémon super cool
 * Class définit pour l'Attaque
 * Commencer le 14/05/2021
 * @author Baptiste
 * */
public class Attaque {
    /**
     * Les attributs de la class
     * */
    private String nom;
    private int nbDeDegats;
    /**
     * Constructeur de la class Attaque
     * */
    public Attaque(String nom, int nbDeDegats) {
        this.nom = nom;
        this.nbDeDegats = nbDeDegats;
    }
    /**
     * Getter et Setter de l'attribut nom
     * */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Getter et Setter de l'attribut nbDeDegats
     * */
    public int getNbDeDegats() {
        return nbDeDegats;
    }

    public void setNbDeDegats(int nbDeDegats) {
        this.nbDeDegats = nbDeDegats;
    }
    /**
     * Affichage du nom de l'attaque et du nombre de dégats
     * */
    public void afficher(){
        System.out.printf("Nom de l'attaque : %sNombre de dégats : %s%n", this.nom, this.nbDeDegats);
    }
}
