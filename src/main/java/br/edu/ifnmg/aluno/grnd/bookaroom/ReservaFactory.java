/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gusta
 */
public interface ReservaFactory {
    Reserva criarReserva(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, String assunto, SalaReuniao sala, Equipamento equipamento);
}
