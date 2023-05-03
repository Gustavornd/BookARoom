/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

/**
 *
 * @author gusta
 */
public class SalaReuniaoFactoryImpl implements SalaReuniãoFactory {
    @Override
    public SalaReuniao criarSala(Long numero, Long qtdLugares){
        return new SalaReuniao(numero, qtdLugares);
    }
}
