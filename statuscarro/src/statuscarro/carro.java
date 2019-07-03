/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statuscarro;

/**
 *
 * @author CBN
 */
public class carro {
    private String placa, marca, color;
    private int modelo,kilometraje;
    
    public carro(String placa, String marca, String color, int modelo, int kilometraje){
        this.placa=placa;
        this.marca=marca;
        this.color=color;
        this.modelo=modelo;
        this.kilometraje=kilometraje;
        
    }
    public String mostrar(){
        String resultado="";
        resultado=placa+ " " +marca+ " " +color+ " " + Integer.toString(modelo)+" "+Integer.toString(kilometraje);
        return resultado;
    }
   public void setkilometraje(int kilometraje){
   this.kilometraje=kilometraje;
       System.out.println("cambio de kilometraje realizado");
   } 
           
}
