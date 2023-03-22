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
public class SalaReuniao {
    private Long numero;
    private Long qtdLugares;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    

    public SalaReuniao(Long numero, Long qtdLugares) {
        this.numero = numero;
        this.qtdLugares = qtdLugares;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getteres/Setteres">


    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(Long qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    
    
//</editor-fold>
    
    @Override
    public String toString() {
        return "Sala{numero=" + numero + ", qtdLugares=" + qtdLugares + '}';
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
        System.out.println("\nHorários reservados da Sala:");
        for(int i = 0; i< reservas.size(); i++){
            System.out.println("Data: " + reservas.get(i).getDataAlocacao()
                    + ", Hora de Inicio: " + reservas.get(i).getHoraInicio()
                    +  ", Hora do Fim: " + reservas.get(i).getHoraFim());
        }
    }
}
