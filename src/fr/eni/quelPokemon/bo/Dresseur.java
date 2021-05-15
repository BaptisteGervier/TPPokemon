package fr.eni.quelPokemon.bo;

public class Dresseur {
    /**
     * Attribut de la class Dresseur
     * */
    private String prenom;
    private Pokemon[] collecPokemons;
    /**
     * Constructeur de la class
     * */
    public Dresseur(String prenom, Pokemon[] pokemons) {
        this.prenom = prenom;
        this.collecPokemons = pokemons;
    }
    /**
     * Getter et setter de l'attribut prenom
     * */
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    /**
     * Getter et Setter de l'attribut pokemon
     * */
    public Pokemon[] getPokemons() {
        return collecPokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.collecPokemons = pokemons;
    }
    /**
     * Affichage du prénom et de la collection de pokemon
     * */
    public void afficher(){
        System.out.printf("Le prenom : %s%nLa collection : %s%n", this.prenom, this.collecPokemons);
    }

    public void capture(Pokemon pikachu){
    }
}
