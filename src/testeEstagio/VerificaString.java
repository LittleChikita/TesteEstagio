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
public class VerificaString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Digite a sua String:");
        String entrada = sc.nextLine();
        
        //Atributos
        int contador = 0;
        
        //Verificando String
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        
        if(contador>0){
                System.out.println(contador);
            } else{
                System.out.println("Não tem letra a");
            }
        
    }
}
