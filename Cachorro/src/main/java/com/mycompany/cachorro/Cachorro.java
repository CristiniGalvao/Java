/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cachorro;

/**
 *
 * @author aluno
 */
public class Cachorro {
    public int tamanho;
    public String nome;
    public int idade;
    public String corAnimal;
    public char sexo;
    
    void latir(){
        if(tamanho > 60)
            System.out.println("Woof!, Woof!");
        else if(tamanho > 14)
            System.out.println("Ruff!, Ruff!");
        else
            System.err.println("Yip!, Yip!");
    }
}
