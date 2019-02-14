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
/*
Se você executar esse programa assim:
$ java PreencheComSublinhado Marcio Belo 15
Você receberá a mensagem 'Entre um nome e uma quantidade'. Isso se deve ao programa entender que três argumentos
estão sendo passados por linha de comando, não dois. Para indicar que são dois, o nome deve estar delimitado
por aspas. Apenas o conteúdo dentro das aspas serão recebidos pelo args[0].
$ java PreencheComSublinhado "Marcio Belo" 15
Na linha 10, usamos o método exit da classe System. Ela aborta imediatamente a execução do programa
e faz interromper a execução da VM (Virtual Machine, ou Máquina Virtual). O valor -1 pode ser capturado
pelo programa que chamou a VM para sinalizar um condição de erro.
Um detalhe curioso: a diferença no uso de length quando aplicado a classe Array, no nosso caso referenciado como
args na linha 7, e quando aplicado a String, como na linha 15. No caso da classe Array, length foi definida como uma 
variável pública; no caso da String, foi definido como método, por isso preciso abrir e fechar parênteses. Uma 
diferença inconveniente visto que se trata do mesmo propósito, mas que mostra que a forma como um objeto será
usado depende da forma em que ele está definido em sua classe.
será usado é a classe que o define.    
Na linha 22 estamos usando uma função chamada sublinhados, definida na mesma classe do nosso programa como static.
A ela é passado um parâmetro inteiro com a quantidade de caracteres sublinhados que eu quero que seja retornado na String.
Repare que a operação de divisão atua sobre dois inteiros, portanto o resultado será o quociente da divisão.
Na linha 23 usamos uma estrutura condicional chamada operador ternário. A expressão à esquerda de ? procure apura se
a quantidade a preencher é ímpar. Se for, adiciono o sublinhado (entre o ? e :) a mais que deve ficar à esquerda do nome. 
Senão ele retorna uma String vazia (à direita de : até o ;), para não adicionar nada ao resultado.
 */
