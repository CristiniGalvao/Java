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
//zeledor que herda de funcionario
public class Funcionario extends Pessoa {
    public double salario;
    public Date data_admissao;

    public Funcionario(String _nome, String _cpf, Date _data, String _endereco,double _salario) {
        super(_nome, _cpf, _data, _endereco);//construtor precisa do super 
        // super define/Constroem o que ja está definido
        this.salario = _salario;
    }

}
