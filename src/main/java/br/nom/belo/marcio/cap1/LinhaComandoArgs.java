package br.nom.belo.marcio.cap1;

public class LinhaComandoArgs 
{
	public static void main(String[] args) 
	{
		int v1 = Integer.parseInt( args[0]);
		int v2 = Integer.parseInt( args[1]);
		System.out.println( "Soma = " + (v1+v2));
	}
}
