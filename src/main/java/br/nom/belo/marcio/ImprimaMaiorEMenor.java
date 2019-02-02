package br.nom.belo.marcio;

public class ImprimaMaiorEMenor {
    public static void main(String[] args) {
        int[] valores = new int[] {4, 25, 7, 9};
        imprimirMaiorEMenor( valores);
    }

    private static void imprimirMaiorEMenor(int[] valores) {

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        for(int n : valores) {

            if(n < menor) menor = n;
            if (n > maior) maior = n;
        }
        System.out.printf("menor = %d, maior = %d", menor, maior);
    }
}
