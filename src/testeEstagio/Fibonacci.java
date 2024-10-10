/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeEstagio;

import java.util.Scanner;
/**
 *
 * @author Little Chikita
 */
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        System.out.print("Digite um número: ");
        int entrada = sc.nextInt();
        
        //Atributos
        int primeirovalor = 0;
        int segundovalor = 1;
        int Fibonacci = 0;
        
        //Calculando Fibonacci
        
        while(entrada > Fibonacci){
             Fibonacci = primeirovalor + segundovalor;
             primeirovalor = segundovalor;
             segundovalor = Fibonacci;
             
             //Verificando a entrada 
             if(Fibonacci > entrada){
                 System.out.println("Não pertence a sequência");
             }else if(Fibonacci == entrada){
                 System.out.println("Pertence a sequência");
             }
        }
        
        
    }
}
