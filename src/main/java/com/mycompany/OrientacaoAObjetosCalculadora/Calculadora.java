/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoAObjetosCalculadora;

/**
 *
 * @author thagory.8187
 */
public class Calculadora {
    private float resultado;

    public Calculadora() {
    }
    
    //Encapsulamento criado pelo java  alt+insert + gett & sett
    public float getResultado() {
        return resultado;
    }
    
    //Encapsulamento criado pelo java  alt+insert + gett & sett
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    //declaracao de parametros
    public float somar(float a, float b){
        //setResultado(a + b);       //passagem de parametros
        return a + b;
    }

    public float subtrair(float a, float b){
        //setResultado(a - b);       //passagem de parametros
        return a - b;
    }

    public float multiplicar(float a, float b){
        //setResultado(a * b);       //passagem de parametros
        return a * b;
    }

    public float dividir(float a, float b){
        if (b != 0){
           // setResultado(a / b);       //passagem de parametros
           return a / b;
        }else{
            System.out.println("Erro: divisão por zero!");
            //setResultado(Float.NaN);    //NaN = NOT A NUMBER    / Float com F maiusculo e uma classe
            return Float.NaN;
        }
    }
}
