/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mini.game.adivinha;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phxofc
 */
public class MiniGameAdivinha {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        Random random = new Random(10);
        
        int tentativas = 10;
        
        int n1;
        
        int ale = 1+random.nextInt(10);
        boolean certo = false;
        
        
        while(tentativas > 0 && certo == false){
            System.out.print("Digite um número entre 1 e 10: ");
            n1 = leia.nextInt();
            if(n1==ale){
            System.out.println("Parabéns voce acertou, Faltando apenas "+tentativas+" Tentativas"); 
            certo=true;
            }
            if(n1>ale){
                System.out.println("É número menor.");
                System.out.println("Você tem: "+tentativas +" Tentativas");
                --tentativas;
            }
            if(n1<ale){
                System.out.println("É um número maior.");
                System.out.println("Você tem: "+tentativas +" Tentativas");
                --tentativas;
    }
            if (tentativas == 0){System.out.println("infelizmente vc perdeu");}
        
    }

    }

}
