import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
   public static void main(String[] args) {
      int numMax = 100;
      int numMin = 0;
      int quantTentativas = 0;
      int numDigitado = -1;

      Random numRandom = new Random();

      int numSorteio = numRandom.nextInt(100);

      Scanner scan = new Scanner(System.in);

      System.out.println("### SISTEMA DE ADIVINHAÇÃO NUMÉRICA - SAN ###");


      while (numDigitado != numSorteio) {
         quantTentativas++;
         System.out.println(quantTentativas + "ª tentativa");
         System.out.print("Digite um número entre " + numMin + " e " + numMax + ": ");
         numDigitado = scan.nextInt();

         if(numMin < numDigitado && numDigitado < numSorteio){
            numMin = numDigitado;
         }
         if(numMax > numDigitado && numDigitado > numSorteio){
            numMax = numDigitado;
         }
      }
      System.out.println("Parabéns! Vc acertou com " + quantTentativas + " tentativas! O número sorteado foi: " + numSorteio);
   }
}