package fr.eni.quelPokemon.bo;

public class Pokemon {

    private String nom;
    private int taille;
    private int poids;
    private int pv;
    private Attaque attaque01;
    private Attaque attaque02;
    private Dresseur dresseur;

    public Pokemon(String nom, int taille, int poids, int pv, Attaque attaque01, Attaque attaque02) {
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.pv = pv;
        this.attaque01 = attaque01;
        this.attaque02 = attaque02;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public Attaque getAttaque01() {
        return attaque01;
    }

    public void setAttaque01(Attaque attaque01) {
        this.attaque01 = attaque01;
    }

    public Attaque getAttaque02() {
        return attaque02;
    }

    public void setAttaque02(Attaque attaque02) {
        this.attaque02 = attaque02;
    }

    public Dresseur getDresseur() {
        return dresseur;
    }

    public void setDresseur(Dresseur dresseur) {
        this.dresseur = dresseur;
    }

    public void afficher(){
        System.out.printf("", this.nom, this.taille, this.poids, this.pv, this.attaque01, this.attaque02);

    }


}
