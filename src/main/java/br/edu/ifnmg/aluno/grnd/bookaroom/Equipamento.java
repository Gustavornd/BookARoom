/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author gusta
 */
public class Equipamento {
    private String patrimonio;
    private String nome;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Equipamento(String patrimonio, String nome) {
        this.patrimonio = patrimonio;
        this.nome = nome;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getteres/Setteres">
    

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReserva(Reserva reservas) {
        this.reservas.add(reservas);
    }
    
    
//</editor-fold>

    @Override
    public String toString() {
        return "Equipamento{patrimonio=" + patrimonio + ", nome=" + nome + '}';
    }
    
    public Boolean disponibilidade(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim){
        if(reservas.isEmpty()){
            return true;
        }
        for(int i = 0; i < reservas.size();i++){
            if(reservas.get(i).getDataAlocacao().equals(dataAlocacao) &&  
                    reservas.get(i).getHoraInicio().equals(horaInicio) &&
                    reservas.get(i).getHoraInicio().equals(horaFim)){
                System.out.println("Horário já reservado!!!");
                mostrarOcupacão();
                return false;
            }
        }
        return true;
    }
    
    public void mostrarOcupacão(){
        System.out.println("\nHorários reservados do Equipamento:");
        for(int i = 0; i< reservas.size(); i++){
            System.out.println("Data: " + reservas.get(i).getDataAlocacao()
                    + ", Hora de Inicio: " + reservas.get(i).getHoraInicio()
                    +  ", Hora do Fim: " + reservas.get(i).getHoraFim());
        }
    }
    
    
}
