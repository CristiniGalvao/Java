/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal2;

/**
 *
 * @author aluno
 */
public class Construtor {

    public static void main(String[] args) {
        ConstrutorAnimal animal = new ConstrutorAnimal(" Gloria", " Raposa", 5, "Laranja", 'F');
        System.out.println(animal.getNome());
        System.out.println(animal.getTipo());
        System.out.println(animal.getIdade());
        System.out.println(animal.getCor());
        System.out.println(animal.getSexo());

        ConstrutorAnimal animal1 = new ConstrutorAnimal(" Marvin", " Lagarto", 2, "Verde", 'M');
        System.out.println(animal1.getNome());
        System.out.println(animal1.getTipo());
        System.out.println(animal1.getIdade());
        System.out.println(animal1.getCor());
        System.out.println(animal1.getSexo());

        ConstrutorAnimal animal2 = new ConstrutorAnimal(" Julian", " Cachorro", 8, "Branco", 'M');
        System.out.println(animal2.getNome());
        System.out.println(animal2.getTipo());
        System.out.println(animal2.getIdade());
        System.out.println(animal2.getCor());
        System.out.println(animal2.getSexo());

        ConstrutorAnimal animal3 = new ConstrutorAnimal(" Bart", " Gato", 2, "Laranja", 'M');
        System.out.println(animal3.getNome());
        System.out.println(animal3.getTipo());
        System.out.println(animal3.getIdade());
        System.out.println(animal3.getCor());
        System.out.println(animal3.getSexo());

        ConstrutorAnimal animal4 = new ConstrutorAnimal(" Betania", " Ganso", 6, "Branco", 'F');
        System.out.println(animal4.getNome());
        System.out.println(animal4.getTipo());
        System.out.println(animal4.getIdade());
        System.out.println(animal4.getCor());
        System.out.println(animal4.getSexo());
    }
}
