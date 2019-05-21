package br.nom.belo.marcio.cap4.reservavel;

public class Onibus implements Reservavel {

	private boolean[] unidades;
	
	public Onibus(int capacidade) {
		
		// não esqueça que as posições boleanas são inicializadas com false,
		// portanto indicando que estão desocupadas
		this.unidades = new boolean[capacidade];
	}
	
	@Override
	public boolean reservar(int unidade) {

		// não esqueça que os arrays em java são baseados em zero
		int unidadeNoArray = unidade-1;
		if( unidadeNoArray < 0 || unidadeNoArray >= unidades.length ) {
			return false;
		}
		if( unidades[ unidadeNoArray]) {
			return false;
		}
		unidades[ unidadeNoArray] = true;
		return true;
	}

	@Override
	public boolean liberar(int unidade) {
		
		int unidadeNoArray = unidade-1;
		if( unidadeNoArray < 0 || unidadeNoArray >= unidades.length ) {
			return false;
		}
		if( unidades[ unidadeNoArray]) { // posição está ocupada
			
			unidades[ unidadeNoArray] = false;
			return true;
		}
		return false; // posição não estava ocupada
	}

	@Override
	public int getQtdeCapacidade() {
		
		return unidades.length;
	}

	@Override
	public int getQtdeVaga() {
		
		return getQtdeCapacidade() - getQtdeOcupada();
	}

	@Override
	public int getQtdeOcupada() {
		int qtdeOcupada = 0;
		for( boolean ocupada : unidades) {
			if( ocupada) qtdeOcupada++;
		}
		return qtdeOcupada;
	}
}
