/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gusta
 */
public class ReservaFactoryImpl implements ReservaFactory {
    @Override
    public Reserva criarReserva(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, String assunto, SalaReuniao sala, Equipamento equipamento){
        return new Reserva(dataAlocacao, horaInicio, horaFim, assunto, sala, equipamento);
    }
}
