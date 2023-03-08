/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author aluno
 */
public class cadAnimal {
  public static void main(String[] args) {
     Animal animalA = new Animal();
     animalA.nome = "Garibaldo";
     animalA.tipo = "Canário";
     animalA.idade = 2;
     animalA.corAnimal = "Amarelo";
     animalA.sexo = 'M';
     
     Animal animalB = new Animal();
     animalB.nome = "Neto";
     animalB.tipo = "cachorro";
     animalB.idade = 5;
     animalB.corAnimal = "preto";
     animalB.sexo = 'M';
     
     Animal animalC = new Animal();
     animalC.nome = "Berenice";
     animalC.tipo = "Galinha";
     animalC.idade = 3;
     animalC.corAnimal = "Branca";
     animalC.sexo = 'F';
     
     Animal animalD = new Animal();
     animalD.nome = "FiFi";
     animalD.tipo = "Ganso";
     animalD.idade = 17;
     animalD.corAnimal = "Branco";
     animalD.sexo = 'F';
     
     Animal animalE = new Animal();
     animalE.nome = "Kripto";
     animalE.tipo = "Cachorro";
     animalE.idade = 6;
     animalE.corAnimal = "Branco";
     animalE.sexo = 'M';
     
            System.out.println("-------------Animais Cadastrados-------------");
            System.out.println("Nome: "+animalA.nome+" Tipo: "+animalA.tipo+
                    " Idade: "+animalA.idade+" anos"+" Cor do Animal: "+animalA.corAnimal+" Sexo: "+animalA.sexo);
            System.out.println("                          ");
            System.out.println("Nome: "+animalB.nome+" Tipo: "+animalB.tipo+
                    " Idade: "+animalB.idade+" anos"+" Cor do Animal: "+animalB.corAnimal+" Sexo: "+animalB.sexo);
            System.out.println("                           ");
            System.out.println("Nome: "+animalC.nome+" Tipo: "+animalC.tipo+
                    " Idade: "+animalC.idade+" anos"+" Cor do Animal: "+animalC.corAnimal+" Sexo: "+animalC.sexo);
            System.out.println("                           ");
            System.out.println("Nome: "+animalD.nome+" Tipo: "+animalD.tipo+
                    " Idade: "+animalD.idade+" anos"+" Cor do Animal: "+animalD.corAnimal+" Sexo: "+animalD.sexo);
            System.out.println("                           ");
            System.out.println("Nome: "+animalE.nome+" Tipo: "+animalE.tipo+
                    " Idade: "+animalE.idade+" anos"+" Cor do Animal: "+animalE.corAnimal+" Sexo: "+animalE.sexo);
    }
}
