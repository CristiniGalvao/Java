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
public class Aluno extends Pessoa {
//nova herança com mais um atributo
    public Aluno(String _nome, String _cpf, Date _data,String _endereco) {
        super(_nome, _cpf, _data,_endereco);
    }
    public String matricula;
}
