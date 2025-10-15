package aula05Atividades;

public class Jornada  extends FuncionarioBase {
private double salarioHora;
private int horasTrabalhadas;

public Jornada(long id, String nome, String telefone, int matricula, String endereco, double salarioHora, int horasTrabalhadas) {
	super (id, nome, telefone, matricula, endereco);
	this.salarioHora = salarioHora;
	this.horasTrabalhadas = horasTrabalhadas;
	
}

@Override
public double calculandoSalario() {
	return salarioHora*horasTrabalhadas;
}
	}
