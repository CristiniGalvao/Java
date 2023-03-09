/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cachorro;

/**
 *
 * @author aluno
 */
public class Cad_Cachorro {
    public static void main(String[] args) {
     Cachorro animalA = new Cachorro();
     animalA.nome = "Garibaldo";
     animalA.idade = 2;
     animalA.corAnimal = "preto";
     animalA.sexo = 'M';
     animalA.tamanho = 10;
     animalA.latir();
     
     Cachorro animalB = new Cachorro();
     animalB.nome = "Neto";
     animalB.idade = 5;
     animalB.corAnimal = "preto";
     animalB.sexo = 'M';
     animalB.tamanho = 19;
     animalB.latir();
     
     Cachorro animalC = new Cachorro();
     animalC.nome = "Berenice";
     animalC.idade = 3;
     animalC.corAnimal = "Branca";
     animalC.sexo = 'F';
     animalC.tamanho = 60;
     animalC.latir();
     
     Cachorro animalD = new Cachorro();
     animalD.nome = "FiFi";
     animalD.idade = 17;
     animalD.corAnimal = "Branco";
     animalD.sexo = 'F';
     animalD.tamanho = 80;
     animalD.latir();
     
     Cachorro animalE = new Cachorro();
     animalE.nome = "Kripto";
     animalE.idade = 6;
     animalE.corAnimal = "Branco";
     animalE.sexo = 'M';
     animalE.tamanho = 55;
     animalE.latir();
     
    }
}
