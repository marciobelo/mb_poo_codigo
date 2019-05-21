package br.nom.belo.marcio.cap4.reservavel;

public interface Reservavel {
	boolean reservar(int unidade);
	boolean liberar(int unidade);
	int getQtdeCapacidade();
	int getQtdeVaga();
	int getQtdeOcupada();
}
