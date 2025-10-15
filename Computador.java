package aula05Atividades;

public class Computador implements InterfaceComputador {

	public void ligar() {
		System.out.println("O computador está ligado.");
		}
	public void reiniciar() {
		System.out.println("O computador será reiniciado.");
	}
	public void desligar() {
		System.out.println("O computador está desligando.");
	}
	public void carregandoSistema() {
		System.out.println("O computador está carregando o sistema.");
	}
	
}
