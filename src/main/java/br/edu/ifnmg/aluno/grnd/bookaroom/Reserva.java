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
public class Reserva {
    private static Reserva instance = null;
    private LocalDate dataAlocacao;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private String assunto;
    private SalaReuniao sala;
    private Equipamento equipamento;

    //<editor-fold defaultstate="collapsed" desc="Constructor">

    public Reserva() {
    }
    

    public Reserva(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, String assunto, SalaReuniao sala, Equipamento equipamento) {
        this.dataAlocacao = dataAlocacao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.assunto = assunto;
        this.sala = sala;
        this.equipamento = equipamento;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getteres/Setteres">
    
    public static Reserva getInstance(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, String assunto, SalaReuniao sala, Equipamento equipamento) {
        if (instance == null) {
            instance = new Reserva(dataAlocacao, horaInicio, horaFim, assunto, sala, equipamento);
        }
        return instance;
        //o ideal aqui é ter alguma indicação que a reserva não pode ser criada porque já existe
    }
    
    public LocalDate getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(LocalDate dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public SalaReuniao getSala() {
        return sala;
    }

    public void setSala(SalaReuniao sala) {
        this.sala = sala;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    //</editor-fold>

    @Override
    public String toString() {
        return "Reserva{" + "dataAlocacao=" + dataAlocacao 
                + ", horaInicio=" + horaInicio 
                + ", horaFim=" + horaFim 
                + ", assunto=" + assunto 
                + ", sala=" + sala 
                + ", equipamento=" + equipamento + '}';
    }
    

    
}
