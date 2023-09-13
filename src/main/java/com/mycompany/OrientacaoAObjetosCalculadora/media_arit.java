/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoAObjetosCalculadora;

/**
 *
 * @author thagory.8187
 */
public class media_arit extends Calculadora{
    public Double mediaAR(Double[] numeros){
        
        double soma = 0;
        double media;

        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }
        
        media = soma / numeros.length;
        
        return media;
                   
    }

}
