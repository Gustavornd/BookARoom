/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

/**
 *
 * @author gusta
 */
public class NotebookFactory implements EquipamentoFactory{
    @Override
    public Equipamento criarEquipamento(String patrimonio, String nome){
        return new Equipamento (patrimonio, nome);
    }
    
    @Override
    public Notebook criarEquipamento(String patrimonio, String nome, String descricao){
        return new Notebook (patrimonio, nome, descricao);
    }
    
}
