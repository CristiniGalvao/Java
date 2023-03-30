/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Menu {

    public static void main(String[] args) {
        Aluno i = new Aluno("Jack Klein", "123.456.789-00", new Date(),"Rua Amarela");
        System.out.println("Veja como os atributos foram preenchidos\nNome: " + i.nome + "\nCpf: "
                + i.cpf + "\nData de Nascimento: " + i.data_nascimento.toString()+"\nEndereço: "+i.endereco+"\n");

        Professor a = new Professor("Dean Winchester", "985.412.759-00", new Date(),"Rua Azul");
        System.out.println("Veja como os atributos foram preenchidos\nNome: " + a.nome + "\nCpf: "
                + a.cpf + "\nData de Nascimento: " + a.data_nascimento.toString()+"\nEndereço: "+i.endereco+"\n");

        Funcionario e = new Funcionario("Castiel Novak", "156.415.715-00", new Date(),"Rua Laranja",3000.56);
        System.out.println("Veja como os atributos foram preenchidos\nNome: " + e.nome + "\nCpf: "
                + e.cpf + "\nData de Nascimento: " + e.data_nascimento.toString()+"Endereço: "+i.endereco);
    }
}
