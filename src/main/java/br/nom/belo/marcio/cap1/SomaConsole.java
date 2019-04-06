package br.nom.belo.marcio.cap1;

import java.io.Console;

public class SomaConsole {
    public static void main(String[] args) 
    {
        Console c = System.console();
        String vs1 = c.readLine();
        String vs2 = c.readLine();
        int v1,v2;
        v1 = Integer.parseInt( vs1 );
        v2 = Integer.parseInt( vs2 );
        System.out.println( "resultado da soma " + ( v1 + v2 ) );

    }
}
