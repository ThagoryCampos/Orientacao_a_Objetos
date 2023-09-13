/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.OrientacaoAObjetosCalculadora;

/**
 *
 * @author thagory.8187
 */
public class ProgramaCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        float soma, sub, mult, div;
        
        soma = calculadora.somar(12, 10);
        sub = calculadora.subtrair(10, 5);
        mult = calculadora.multiplicar(10, 10);
        div = calculadora.dividir(10, 2);
        //calculadora.multiplicar(2, 10);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
    }
}
