package br.nom.belo.marcio;
import java.util.Scanner;
public class SomaScanner {
    public static void main(String[] args) 
    {
    	Scanner entrada = new Scanner( System.in);
    	int v1 = entrada.nextInt();
    	int v2 = entrada.nextInt();
        System.out.println( "resultado da soma " + ( v1 + v2 ) );
        entrada.close();
    }
}