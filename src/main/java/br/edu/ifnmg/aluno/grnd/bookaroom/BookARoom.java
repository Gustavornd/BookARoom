/*
 * Classe de Sistema e controle (Main)
 */
package br.edu.ifnmg.aluno.grnd.bookaroom;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class BookARoom {
    
    

    public static void main(String[] args) {
        //Cria um Campus
        Campus c1 = new Campus("MocHell", "Rua 2, Vilage 1");
        
        //Cria Predios
        Predio p1 = new Predio("Predio 1");
        Predio p2 = new Predio("Predio 2");

        //Cria Salas
        SalaReuniao s1 = new SalaReuniao(1L, 40L);
        SalaReuniao s2 = new SalaReuniao(2L, 40L);
        SalaReuniao s3 = new SalaReuniao(3L, 40L);
        SalaReuniao s4 = new SalaReuniao(4L, 40L);
        

        


        //Cria Equipamentos
        Equipamento e1 = new Equipamento("IF001", "Projetor");
        Equipamento e2 = new Equipamento("IF002", "TV");
        Equipamento e3 = new Equipamento("IF003", "Controle Arcondicionado");
        
                Reserva r1 = new Reserva(LocalDate.of(2023, Month.MARCH, 01),
                LocalTime.of(11, 00),
                LocalTime.of(12,40), 
                "Aula de APS", 
                s2, 
                e2);
                
        s2.setReserva(r1);
        e1.setReserva(r1);

        ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
        equipamentos.add(e1);
        equipamentos.add(e2);
        equipamentos.add(e3);

        ArrayList<SalaReuniao> salas = new ArrayList<SalaReuniao>();
        salas.add(s1);
        salas.add(s2);
        salas.add(s3);
        salas.add(s4);

        //Adiciona as salas e equipamentos aos predios
        p1.setSalas(salas);
        p2.setSalas(salas);
        p1.setEquipamentos(equipamentos);
        p2.setEquipamentos(equipamentos);

        ArrayList<Predio> predios = new ArrayList<Predio>();
        predios.add(p1);
        predios.add(p2);
        
        //Adiciona os predios ao campus
        c1.setPredios(predios);
        
        //Adiciona o campus ao funcionário
        Funcionario f1 = new Funcionario("Lucio", "Professor", "1234",c1);
        Funcionario f2 = new Funcionario("Caribe", "Professor", "1235",c1);

        System.out.println(c1.toString());
        c1.mostrarPredios();
        System.out.println("\n---- XXXXXXX ----");
        System.out.println(c1.getPredios().get(0).toString());
        c1.getPredios().get(0).mostrarSalas();
        c1.getPredios().get(0).mostrarEquipamentos();
        System.out.println("\n---- XXXXXXX ----");
        System.out.println(c1.getPredios().get(1).toString());
        c1.getPredios().get(1).mostrarSalas();
        c1.getPredios().get(0).mostrarEquipamentos();
        System.out.println("\n---- XXXXXXX ----");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        
        
        

        
        
        System.out.println("----- Realizando reservas ----- ");
        
        Reserva r2;
        Reserva r3;

        f1.pedirDisponibilidadeEquipamento(c1.getPredios().get(0).getEquipamentos().get(0));
        f1.pedirDisponibilidadeSala(c1.getPredios().get(0).getSalas().get(0));
        
        
        //Criando a primeira Reserva
        r2 = f1.realizarReserva(LocalDate.of(2023,03,01),
                LocalTime.of(11, 00),
                LocalTime.of(12,40),
                "Aula de APS",
                c1.getPredios().get(0).getSalas().get(0),
                c1.getPredios().get(0).getEquipamentos().get(0));
        
        System.out.println(r2.toString());
        
        
        //Por conta da não implementação de um banco de dados, não conseguimos verificar
        //os horários disponívies para a sala, pois em JAVA, temos passagem de variaveis
        //por valor e não por referência, assim seria necesssária a implementação de banco
        //de dados para resolver o conflito de horários. 
        
        r3 = f2.realizarReserva(LocalDate.of(2023,03,01),
                LocalTime.of(11, 00),
                LocalTime.of(12,40),
                "Aula de SO",
                c1.getPredios().get(0).getSalas().get(0),
                c1.getPredios().get(0).getEquipamentos().get(0));
        
        System.out.println(r3.toString());
        
        
        
        
        
    }
}
