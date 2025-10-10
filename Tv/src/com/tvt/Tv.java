/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt;

/**
 *
 * @author Admin
 */
public class Tv {
     
    //1- Crear la clase Tv y agregar al menos 4 atributos y cuatro métodos. (Archivo Tv.Java)
    
    String Marca;
    double Tamano;
    int Volumen;
    int Canal;
    boolean encendido;

    //Constructores
    
    public Tv() {
    };
    
    public Tv(String Marca, double Tamano, int Volumen, int Canal,
            boolean encendido) {
        this.Marca = Marca;
        this.Tamano = Tamano;
        this.Volumen = Volumen;
        this.Canal = Canal;
        this.encendido = encendido;
    }

    //Metodos
   
    public void Encender() {
        encendido = true;
        System.out.println("Televison encendida, Hello!");
    }

    public void Apagar() {
        encendido = false;
        System.out.println("Television apagada bye");
    }

    public void CambiarCanal(int canal) {
        this.Canal = canal;
        System.out.println("Estas viendo el canal " + canal);
    }

    public void SubirVolumen(int Volumen) {
        this.Volumen = Volumen;
        System.out.println("Volumen a " + Volumen);
    }

    public void BajarVolumen(int Volumen) {
        this.Volumen = Volumen;
        System.out.println("Volumen a " + Volumen);
    }
    
    public void MostrarInformacion() {
        System.out.println("Marca: "+ Marca);
        System.out.println("Pulgadas: "+Tamano);
        System.out.println("Volumen: "+Volumen);
        System.out.println("Canal: "+Canal);
        System.out.println("Televisor "+encendido);
    }
    
}
