/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

/**
 *
 * @author gusta
 */
public class CampusFactoryImpl implements CampusFactory {

    @Override
    public Campus criarCampus(String nome, String endereco) {
        return new Campus(nome, endereco);
    }

}
