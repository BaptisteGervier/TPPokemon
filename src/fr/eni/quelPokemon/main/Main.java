package fr.eni.quelPokemon.main;

import fr.eni.quelPokemon.bo.Attaque;
import fr.eni.quelPokemon.bo.Dresseur;
import fr.eni.quelPokemon.bo.Pokemon;

public class Main {
    public static void main(String[] args){
        Dresseur sasha = new Dresseur("Sasha");
        Dresseur ondine = new Dresseur("Ondine");
        Pokemon pikachu = new Pokemon("Pikachu", 40, 6000, 120);
        Attaque statik = new Attaque("statik", 20);
        Attaque paratonnerre = new Attaque("paratonnerre", 75);
    }



}
