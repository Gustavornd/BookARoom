/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Predio {
    private String nome;
    private ArrayList<SalaReuniao> salas;
    private ArrayList<Equipamento> equipamentos;
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Predio(String nome) {
        this.nome = nome;
        this.salas = new ArrayList<>();
        this.equipamentos = new ArrayList<>();
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getteres/Setteres">
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<SalaReuniao> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<SalaReuniao> salas) {
        this.salas = salas;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    

    
    //</editor-fold>

    @Override
    public String toString() {
        return "Predio{" + "nome=" + nome + "}";
    }
    
    public void mostrarSalas(){
        for(int i=0; i < salas.size();i++){
            System.out.println(salas.get(i).toString());
        }
    }
    
    public void mostrarEquipamentos(){
        for(int i=0; i < equipamentos.size();i++){
            System.out.println(equipamentos.get(i).toString());
        }
    }
    
    
}
