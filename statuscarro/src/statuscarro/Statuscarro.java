/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statuscarro;

import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Statuscarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        String placa, marca, color;
        int modelo, kilometraje;
        carro model;
        System.out.println("ingrese placa del carro");
        placa=l.next();
        System.out.println("ingrese marca del carro");
        marca=l.next();
        System.out.println("ingrese color del carro");
        color=l.next();
        System.out.println("ingrese modelo");
        modelo=l.nextInt();
        System.out.println("ingrese kilometraje");
        kilometraje=l.nextInt();
        model = new carro(placa, marca, color, modelo, kilometraje);
        
        System.out.println(model.mostrar());
                
    }
    
}
