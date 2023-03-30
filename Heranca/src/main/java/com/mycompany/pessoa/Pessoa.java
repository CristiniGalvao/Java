/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pessoa;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa {
//exemplo de herança
//classe mae da herança
    public String nome;
    public String cpf;
    public Date data_nascimento;
    public String endereco;

    public Pessoa(String _nome, String _cpf, Date _data,String _endereco) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
        this.endereco = _endereco;
    }
}
