/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal2;

/**
 *
 * @author aluno
 */
public class ConstrutorAnimal {

    private String nomeAnimal;
    private String tipoAnimal;
    private int idadeAnimal;
    private String corAnimal;
    private char sexoAnimal;

    public ConstrutorAnimal(String nome, String tipo, int idade, String cor, char sexo) {
        nomeAnimal = nome;
        tipoAnimal = tipo;
        idadeAnimal = idade;
        corAnimal = cor;
        sexoAnimal = sexo;
    }

    public String getNome() {
        return "Nome do Animal " + nomeAnimal;
    }

    public String getTipo() {
        return "Tipo do Animal " + tipoAnimal;
    }

    public String getIdade() {
        return "Idade do Animal " + idadeAnimal;
    }

    public String getCor() {
        return "Cor do Animal " + corAnimal;
    }

    public String getSexo() {
        return "Sexo do Animal " + sexoAnimal;
    }
}
