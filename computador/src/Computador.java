/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Computador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        String marca,modelo, procesador, board;
        double hdd,ram;
        computado pcl;
        System.out.println("ingrese marca ");
        marca = l.next();
        System.out.println("ingrese modelo ");
        modelo = l.next();
        System.out.println("ingrese procesador ");
        procesador = l.next();
        System.out.println("ingrese board ");
        board = l.next();
        System.out.println("ingrese ram ");
        ram = l.nextDouble();
        System.out.println("ingrese hdd ");
        hdd = l.nextDouble();
        pcl = new computado (marca, modelo, procesador, board, ram, hdd);
        
        System.out.println(pcl.mostrar());
        
    }
    
}
