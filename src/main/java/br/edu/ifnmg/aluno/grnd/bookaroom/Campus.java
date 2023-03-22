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
public class Campus {
    private String nome;
    private String endereco;
    private ArrayList<Predio> predios;
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    

    public Campus(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.predios = new ArrayList<>();
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Predio> getPredios() {
        return predios;
    }

    public void setPredios(ArrayList<Predio> predios) {
        this.predios = predios;
    }
    
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Campus{nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    /**
     *
     */
    public void mostrarPredios(){
        for(int i=0; i < predios.size();i++){
            System.out.println(predios.get(i).toString());
        }
    }
    
    
    
    
    
}
