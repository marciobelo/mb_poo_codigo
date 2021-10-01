package br.nom.belo.marcio.cap3.exercicio;

public class Dispensador {

    private int[] quantidades = { 0, 0, 0, 0, 0, 0, 0};
    private int[] valores = { 2, 5, 10, 20, 50, 100, 200} ;

    public Object listar() {
        String aux = "";
        double total = 0;
        for( int i=0; i < valores.length; i++) {
            aux += "(" + valores[i] + "):" + quantidades[i] + " ";
            total += valores[i] * quantidades[i];
        }
        aux += "TOTAL:" + total;
        return aux;
    }

    public boolean adicionar(int valorDaCedula, int quantidade) {
        int i = acharIndiceCedula( valorDaCedula);
        if( i != -1 && quantidade > 0) {
            quantidades[i] += quantidade;
            return true;
        } else {
            return false;
        }
    }

    private int acharIndiceCedula(int valorDaCedula) {
        for( int i=0; i < valores.length; i++) {
            if( valores[i] == valorDaCedula) {
                return i;
            }
        }
        return -1;
    }

    public boolean retirar(int valorDaCedula, int quantidadeARetirar) {
        int i = acharIndiceCedula( valorDaCedula);
        if( i != -1 && quantidades[i] >= quantidadeARetirar && quantidadeARetirar > 0) {
            quantidades[i] -= quantidadeARetirar;
            return true;
        } 
        return false;
    }
}