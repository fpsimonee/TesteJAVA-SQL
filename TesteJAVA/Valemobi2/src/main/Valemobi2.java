/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Objects.customer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.customerDAO;

/**
 *
 * @author Administrador
 */
public class Valemobi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<customer> vet = new ArrayList<customer>();
        List<customer> impressos = new ArrayList<customer>();
        customerDAO dao;
        double media = 0;
        
        try {
            dao = new customerDAO();
            vet = dao.consultar();
        } catch (SQLException ex) {
            Logger.getLogger(Valemobi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Valemobi2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      // Seleciono os objetos que estao dentro das condicoes 
        for (int i = 0; i < vet.size(); i++) {
            if (vet.get(i).getId_customer() > 1500 && vet.get(i).getId_customer() < 2700
                    && vet.get(i).getValor_total()>560) {
                media = media + vet.get(i).getValor_total();
                impressos.add(vet.get(i));
            }
        }
        
        //calculo da media da soma dos valores totais dos objetos dentro das condicoes 
        media = media/2;
        System.out.println("Media: "+ media);
        
        // Impressao dos Objetos Selecionados para Media
        for (int i = 0; i <impressos.size(); i++) {
            
            System.out.println("ID_Customer:"+impressos.get(i).getId_customer());
            System.out.println("CPF/CNPJ:"+impressos.get(i).getCnpj());
            System.out.println("Nome:"+impressos.get(i).getName());
            System.out.println("Is_active:"+impressos.get(i).isIs_active());
            System.out.println("Valor Total:"+impressos.get(i).getValor_total());
            System.out.println("\n");
        }

    }
}
