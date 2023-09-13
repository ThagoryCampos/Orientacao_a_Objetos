/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoAObjetosCalculadora;

/**
 *
 * @author thagory.8187
 */
public class CalculadoraCientifica extends Calculadora{
    public Double raizQuadrada(Double a){
        return Math.sqrt(a);
    }
    
    public Double potencia(Double a, Double b){
        return Math.pow(a, b);
    }
}
