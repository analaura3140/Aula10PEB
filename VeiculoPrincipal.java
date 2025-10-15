package heranca;

public class VeiculoPrincipal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Ferrari", "FERRARI 12CILINDRI", 2023, "Vermelha");
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		
		Automovel automovel = new Automovel("Ferrari", "FERRARI 12CILINDRI", 2023, "Vermelha", 4, "eletrico");
		System.out.println(automovel.getMarca());
		System.out.println(automovel.getModelo());
		System.out.println(automovel.getAno());
		System.out.println(automovel.getCor());
		System.out.println(automovel.getNumeroPortas());
		System.out.println(automovel.getMotor());
		
		Moto moto = new Moto("Ferrari", "FERRARI 12CILINDRI", 2023, "Vermelha", 160 );
		System.out.println(moto.getMarca());
		System.out.println(moto.getModelo());
		System.out.println(moto.getAno());
		System.out.println(moto.getCor());
		System.out.println(moto.getCilindrada());
	}

}
