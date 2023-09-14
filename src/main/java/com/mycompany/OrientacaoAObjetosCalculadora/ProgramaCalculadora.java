/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.OrientacaoAObjetosCalculadora;

import java.util.Scanner;

/**
 *
 * @author thagory.8187
 */
public class ProgramaCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        CalculadoraMedia mediat = new CalculadoraMedia();
                
        Scanner scanner = new Scanner(System.in);
        
        float soma, sub, mult, div, num1, num2, num3, opcao = 0;
        
        System.out.println("Informe a Calculadora que deseja usar");
        System.out.println("1 - Calculadora Comum");
        System.out.println("2 - Calculadora Cientifica");
        System.out.println("3 - Média Aritmética");
        System.out.println("4 - Média Ponderada");
        opcao = scanner.nextFloat();
        
        if(opcao == 1 ){
            System.out.println("Informe o primeiro numero: ");
            num1 = scanner.nextFloat();

            System.out.println("Informe o segundo numero: ");
            num2 = scanner.nextFloat();

            soma = calculadora.somar(num1, num2);
            sub = calculadora.subtrair(num1, num2);
            mult = calculadora.multiplicar(num1, num2);
            div = calculadora.dividir(num1, num2);
        
        //calculadora.multiplicar(2, 10);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
        
        }else{
            if(opcao == 2){
                //RAIZ QUADRADA
                System.out.println("-----------------------------------------------------");
                System.out.println("Agora, informe um número para saber a raiz quadrada: ");
                Double numRq = scanner.nextDouble();
                Double rq = cc.raizQuadrada(numRq);
                System.out.println("A raiz quadrada de " + numRq + " é " + rq);

                //CALCULADORA 
                System.out.println("-----------------------------------------------------");
                System.out.println("informe um número: ");
                Double num = scanner.nextDouble();
                System.out.println("informe uma potencia: ");
                Double numPot = scanner.nextDouble();
                Double pow = cc.potencia(num, numPot);
                System.out.println(num + " elevado a " + numPot + " é: " + pow);
        
            }else{
                if(opcao == 3){
                    //MEDIA ARITMERICA
                    float media;

                    System.out.println("Infome a primeira nota: ");
                    num1 = scanner.nextFloat();

                    System.out.println("Infome a segunda nota: ");
                    num2 = scanner.nextFloat();

                    System.out.println("Infome a terceira nota: ");
                    num3 = scanner.nextFloat();

                    media = mediat.mediaAR(num1, num2, num3);
                    System.out.println("Resultado da media aritmetica: "  + media);
                }else if(opcao == 4){
                    //MEDIA PONDERADA
                    float valor1 , valor2, valor3, peso1, peso2, peso3, media;

                    System.out.println("Informe a primeira nota: ");
                    valor1 = scanner.nextFloat();

                    System.out.println("Informe a primeira peso: ");
                    peso1 = scanner.nextFloat();

                    System.out.println("Informe a segunda nota: ");
                    valor2 = scanner.nextFloat();

                    System.out.println("Informe a segundo peso: ");
                    peso2 = scanner.nextFloat();

                    System.out.println("Informe a terceira nota: ");
                    valor3 = scanner.nextFloat();

                    System.out.println("Informe a terceiro peso: ");
                    peso3 = scanner.nextFloat();

                    media = mediat.mediaPond(valor1, valor2, valor3, peso1, peso2, peso3);
                    System.out.println("A media ponderada é: " + media);
        
                }
            }
        }
    }
}
