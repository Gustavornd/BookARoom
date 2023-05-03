/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

/**
 *
 * @author gusta
 */
public class Notebook extends Equipamento{
    public String descricao;

    public Notebook(String patrimonio, String nome, String descricao) {
        super(patrimonio, nome);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Notebook{"+ super.toString() + "descricao=" + descricao + '}';
    }
    
    
    
}
