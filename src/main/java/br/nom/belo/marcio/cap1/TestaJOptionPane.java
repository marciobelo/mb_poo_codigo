package br.nom.belo.marcio.cap1;

import javax.swing.JOptionPane;

public class TestaJOptionPane 
{
	public static void main(String[] args) 
	{
		String nome = JOptionPane.showInputDialog(null, "Entre seu nome");
		if( nome != null)  JOptionPane.showMessageDialog(null, "Olá " + nome);  
	}
}
