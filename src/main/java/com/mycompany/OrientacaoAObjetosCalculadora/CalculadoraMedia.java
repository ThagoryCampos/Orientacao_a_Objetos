/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoAObjetosCalculadora;

/**
 *
 * @author thagory.8187
 */
public class CalculadoraMedia extends Calculadora{
    public float mediaAR(float num1 ,float num2 ,float num3){
       return (num1 + num2 + num3) / 3;
    }   
    
    public float mediaPond(float valor1,float valor2,float valor3, float peso1, float peso2, float peso3){
        return (((valor1 * peso1 )+(valor2 * peso2) + (valor3 * peso3)) / (peso1 + peso2 + peso3));
    }
}
