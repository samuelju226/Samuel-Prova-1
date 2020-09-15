package br.edu.univas.main;

import java.util.Scanner;

public class Questão2 {
     
	public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = leitura.nextLine();
        System.out.println("A palavra invertida: " + palavra + " é " + avralap(palavra));
    leitura.close();
	}
    
    public static String avralap(String palavra) {
        String pa = "";
        for(int i = palavra.length()-1; i >= 0; --i) {
            pa += palavra.charAt(i); 
        }
        return pa;
    }

}
		 
		