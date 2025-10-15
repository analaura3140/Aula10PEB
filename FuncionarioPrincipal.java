package aula10;

public class FuncionarioPrincipal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Malu", "001", 3000, "1599999-9999", "Ruao 0", "23/07/2008");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());

		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("  ");
		
		Administrador administrador = new Administrador("Nay", "001", 3000, "1599999-9999", "Ruao 0", "18/12/2008",
				001);
		System.out.println("Funcionario:");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matricula: " + administrador.getMatricula());
		System.out.println("Salario: " + administrador.getSalario());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("Endereço: " + administrador.getEndereco());
		System.out.println("Data de Nascimento: " + administrador.getDataNascimento());
		System.out.println("cra: " + administrador.getCra());

		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("  ");
		
		Engenheiro engenheiro = new Engenheiro("Júlia", "001", 3000, "1599999-9999", "Ruao 0", "11/11/2008", 001);
		System.out.println("Funcionario:");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matricula: " + engenheiro.getMatricula());
		System.out.println("Salario: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereço: " + engenheiro.getEndereco());
		System.out.println("Data de Nascimento: " + engenheiro.getDataNascimento());
		System.out.println("cra: " + engenheiro.getNumCrea());

		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("  ");
		
		Medico medico = new Medico("Ana", "001", 3000, "1599999-9999", "Ruao 0", "13/04/2009", 001);
		System.out.println("Funcionario:");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matricula: " + medico.getMatricula());
		System.out.println("Salario: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereço: " + medico.getEndereco());
		System.out.println("Data de Nascimento: " + medico.getDataNascimento());
		System.out.println("cra: " + medico.getCrm());
	}

}
