package br.nom.belo.marcio;

public class PreencheComSublinhado {

	public static void main(String[] args) {

			if( args.length != 2) {
				
				System.out.println( "Entre um nome e uma quantidade");
				System.exit( -1);
			}

			String nome = args[0];
			int qtde = Integer.parseInt( args[1]);
			if( nome.length() >= qtde) {
				
				System.out.println( nome.substring( 0, qtde));
			}
			else {
				
				int qtdeApreencher = qtde - nome.length();
				String preenchido = sublinhados( qtdeApreencher / 2) +
									( qtdeApreencher % 2 != 0 ? "_" : "") +
									nome + 
									sublinhados( qtdeApreencher / 2);
				System.out.println( preenchido);					
			}
	}

	private static String sublinhados(int n) {
		
		String result = "";
		for( int i=0; i < n; i++) {
			
			result = result + "_";
		}
		return result;
	}
}
