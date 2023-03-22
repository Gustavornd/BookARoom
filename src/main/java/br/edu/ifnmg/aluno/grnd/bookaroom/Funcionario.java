/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;


/**
 *
 * @author gusta
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private String ramal;
    private Campus campus;

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    

    public Funcionario(String nome, String cargo, String ramal, Campus campus) {
        this.nome = nome;
        this.cargo = cargo;
        this.ramal = ramal;
        this.campus = campus;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getteres/Setters">
    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    
    
    
    //</editor-fold>
    
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome 
                + ", cargo=" + cargo 
                + ", ramal=" + ramal 
                + " " + campus.toString();
    }
    
    public Reserva realizarReserva(LocalDate dataAlocacao, 
            LocalTime horaInicio, LocalTime horaFim, 
            String assunto, SalaReuniao sala, Equipamento equipamento){
        
        Reserva reserva = new Reserva();
        
        reserva.setAssunto(assunto);
        reserva.setDataAlocacao(dataAlocacao);
        reserva.setHoraFim(horaFim);
        reserva.setHoraInicio(horaInicio);
        
        if(sala.disponibilidade(dataAlocacao, horaInicio, horaFim)){
            reserva.setSala(sala);
        }
        else{
            return null;
        }
        
        
        if(equipamento.disponibilidade(dataAlocacao, horaInicio, horaFim)){
            reserva.setEquipamento(equipamento);
        }
        else{
            return null;
        }
        
        return reserva;
    }
    
    public void pedirDisponibilidadeSala(SalaReuniao sala){
        sala.mostrarOcupacão();
    }
    
    public void pedirDisponibilidadeEquipamento(Equipamento equipamento){
        equipamento.mostrarOcupacão();
    }

}
