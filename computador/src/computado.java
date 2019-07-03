/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class computado {
    private final String marca;
    private String modelo, procesador, board;
private double ram, hdd;

public computado (String marca, String modelo, String procesador, String board, double ram, double hdd) {
     this.marca=marca;
     this.modelo=modelo;
     this.procesador=procesador;
     this.board=board;
     this.ram=ram ;       
     this.hdd=hdd;
}

public String mostrar(){
    String resultado=" ";
    resultado=marca +" "+modelo+" " +procesador+ " "+board+" "+ Double.toHexString(ram)+" "+ Double.toHexString(hdd);
    return resultado;
    
}
  public void setprocesador(String Procesador) {
    this.procesador =Procesador ;
    System.out.println("cambio de procesador realizado");
    
}
public void setRam(double ram) {
    this.ram = ram;
    System.out.println("cambio de ram realizado");
    
}
public void setHDD(double hdd) {
    this.hdd = hdd;
    System.out.println("cambio de hdd realizado");
    
}
}
       

