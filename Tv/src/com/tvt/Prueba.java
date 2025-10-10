/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt;


/**
 *
 * @author Admin
 */
public class Prueba {
    public static void main(String[] args) {
        /*
        Debe crear 3 instancias de la clase Tv.
        Debe asignar valores a cada uno de sus atributos        */
        
        Tv TvHabitacion = new Tv("Samsung",24.5,10,8,true);
        Tv TvSala = new Tv("Sony" , 43.0,15,45,false);
        Tv TvComedor = new Tv("Samsung",60.5,20,21,false );
        
        //Debe invocar cada uno de sus métodos.
        
        System.out.println("Televisor de la Habitacion");
        TvHabitacion.Encender();
        TvHabitacion.CambiarCanal(15);
        TvHabitacion.SubirVolumen(14);
        TvHabitacion.BajarVolumen(01);
        TvHabitacion.Apagar();
        
        System.out.println("");
        
        System.out.println("Televisor de la Sala");
        TvSala.Encender();
        TvSala.CambiarCanal(22);
        TvSala.SubirVolumen(23);
        TvSala.BajarVolumen(0);
        TvSala.Apagar();
        
        System.out.println("");
        
        System.out.println("Televisor del Comedor");
        TvComedor.Encender();
        TvComedor.CambiarCanal(105);
        TvComedor.SubirVolumen(30);
        TvComedor.BajarVolumen(02);
        TvComedor.Apagar();
        
        
        
        
     
        
      
        
        
        
    }
    
}
