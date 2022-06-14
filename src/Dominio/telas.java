package Dominio;

public class telas {

	public static void telaInicial() {
		linhaDois();
		System.out.println("             BEM VINDO AO SGH - SISTEMA DE GERENCIAMENTO DO HOTEL            ");
		linhaDois();
		espaco();
		System.out.println("  1 - Clientes ");
		System.out.println("  2 - Quartos ");
		linhaUm();
		System.out.println("  3 - Check In");
		System.out.println("  4 - Check Out");
		linhaUm();
		System.out.println("  0 - SAIR");
		linhaDois();
		
	}

	public static void linhaUm() {
		System.out.println("------------------------------------------------------------------------");
	}

	public static void linhaDois() {
		System.out.println("========================================================================");
	}
	
	public static void espaco() {
		System.out.println("                                                                        ");
	}
}
