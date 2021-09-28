package br.nom.belo.marcio.cap3.exercicio;
public class CorridaMaluca {
    public static void main(String[] args) {
        Carro dick = new Carro();
        Carro penelope = new Carro();
        dick.mudarVelocidadeEm( 60);
        penelope.mudarVelocidadeEm( 80);
        dick.mudarVelocidadeEm( 40);
        penelope.mudarVelocidadeEm( 30);
        dick.mudarVelocidadeEm( -20);
        penelope.mudarVelocidadeEm( -10);
        System.out.printf("velocidade dick %d penelope %d maxima %d", 
            dick.velocidade, penelope.velocidade, Carro.velocidade_maxima);
    }
}
class Carro {
    int velocidade = 0 ;
    static int velocidade_maxima = 100;
    void mudarVelocidadeEm( int aumento) {
        this.velocidade += aumento;
        if( this.velocidade > velocidade_maxima) {
            velocidade_maxima = velocidade_maxima - 10;
        }
    }
}