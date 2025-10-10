/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Calculadora;

/**
 *
 * @author Admin
 */
public class Calculadora {
    
    /*Crear una clase Calculadora (Calculadora.java) con los métodos
sumar, restar, multiplicar y dividir que reciba dos parámetros enteros
y retorne el resultado (utilizar la palabra reservada return).*/

    
    int num1,num2,num3,num4;
        
    
    public int sumar(int num1, int num2) {
    return num1+num2;
     
    }
    
    public int restar(int num1, int num2) {
    return num1-num2;
    }
    
    public int multiplicar(int num1,int num2 ) {
    return num1*num2;
    }
    
  public int dividir(int num1,int num2) {
  if (num2==0) {System.out.println("no se puede dividir entre 0");
    return 0;
  }
  return(int) num1/num2;
  };
  
  /*Sobrecargar los métodos sumar, restar y multiplicar (no el dividir)
  para que reciba tres parámetros enteros y retorne el
  resultado (utilizar la palabra reservada return).*/
  
  public int sumar(int num1, int num2, int num3) {
  return num1+num2+num3;
  }
  
 public int restar(int num1, int num2, int num3) {
 return num1- num2-num3;
 }
 
 public int multiplicar(int num1, int num2, int num3) {
 return num1*num2*num3;
 }
 
 /*Sobrecargar los métodos sumar, restar y multiplicar (no el dividir)
 para que reciba tres parámetros enteros y retorne el resultado 
 (utilizar la palabra reservada return).*/
 
 public int sumar(int num1, int num2, int num3,int num4) {
 return num1+num2+num3+num4;
 }
 
 public int restar(int num1, int num2, int num3,int num4) {
 return num1-num2-num3-num4;
 }
 
 public int multiplicar(int num1, int num2, int num3,int num4) {
 return num1*num2*num3*num4;
 }
  
    
    
}
