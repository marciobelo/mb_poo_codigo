package br.nom.belo.marcio;

public class DesafioDoArray
{
  public static void main(String[] args) 
  {
    int[] umArray = new int[] { 0, 2, 4, 6, 8 };
    int[] outroArray = umArray;
    fazerSoma( umArray);
    fazerSoma( outroArray);

    exibir( umArray);
  }
  private static void fazerSoma(int[] array) 
  {
    for (int i = 0; i < array.length; i++) 
	{
      array[i] = array[i] + 2;
    }
  }
  private static void exibir(int[] array)
  {
	  for(int x : array) System.out.println(x);
  }
}