/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author SebastianR
 */
public class Persona {
    
    int DNI;
    String Nombre, Apellido;
    
    public Persona(){
       this.DNI = 0;
       this.Nombre = "";
       this.Apellido = "";
         }    
    
    public Persona(int DNI){
          this();
          this.DNI = DNI;    
         }    
    
    public Persona(int DNI , String Nombre){
          this(DNI);
          this.Nombre = Nombre; 
       
         }    
    public Persona(int DNI , String Nombre , String Apellido){
           this(DNI,Nombre);
           this.Apellido = Apellido;  
         }
    
    public void mostrar(){
    
    System.out.println( DNI +" "+ Nombre +" "+ Apellido );
    }
    
}
