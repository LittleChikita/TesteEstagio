/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeEstagio;

/**
 *
 * @author Little Chikita
 */
public class Soma {

    public static void main(String[] args) {

        //Atributos
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        //Somando
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA);
    }
}
