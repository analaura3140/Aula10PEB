package aula05Atividades;

public class ComputadorPrincipal {

	public static void main(String[] args) {
		
		Computador computadorGame = new Computador();
		Computador computadorHome = new Computador();
		
		computadorGame.ligar();
		computadorGame.carregandoSistema();
		computadorGame.reiniciar();
		computadorGame.desligar();
		
		System.out.println(" ");
		
		computadorHome.ligar();
		computadorHome.carregandoSistema();
		computadorHome.reiniciar();
		computadorHome.desligar();

	}

}
