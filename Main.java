/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superheroi;

/**
 *
 * @author prof212
 */
public class Main {
    
    public static void main(String[] args) {
       SuperHeroi homemAranha = new SuperHeroi();
       homemAranha.nome = "Homem Aranha";
       homemAranha.identidade_secreta = "Peter Parker";
       homemAranha.poder = 70;
       homemAranha.fraqueza = "Morte do tio Ben";
       homemAranha.grupo = "Vingadores";
       homemAranha.apresentar();
       homemAranha.usarPoder();
       System.out.println("----------------------------------");
     
       SuperHeroi superMan = new SuperHeroi();
       superMan.nome = "Superman";
       superMan.identidade_secreta = "Clark Kent";
       superMan.grupo = "Liga da Justiça";
       superMan.fraqueza = "Kriptonita";
       superMan.poder = 95;
       superMan.apresentar();
       superMan.usarPoder();

       
    }
}
