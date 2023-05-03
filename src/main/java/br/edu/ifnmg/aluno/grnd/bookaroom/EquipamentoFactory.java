/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

/**
 *
 * @author gusta
 */
public interface EquipamentoFactory {
    Equipamento criarEquipamento(String patrimonio, String nome);
    Notebook criarEquipamento(String patrimonio, String nome, String descricao);
}
