package aula05Atividades;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
FuncionarioBase funcionario1 = new Jornada( 1234, "Ana", "15 000000-0000", 456, "gvygbuhb", 30, 40);
FuncionarioBase funcionario2 = new Horista(1245, "André", "15 000000-0001", 987, "jbygvbhbygh", 60, 50);
PessoaJuridica funcionario3 = new PessoaJuridica(2563, "Érica", "15 000000-0002", 852, "hbvxhsdbcushdbnc", 40000, 20000);

System.out.println(funcionario1.getId());
System.out.println(funcionario1.getNome());
System.out.println(funcionario1.getTelefone());
System.out.println(funcionario1.getMatricula());
System.out.println(funcionario1.getEndereco());
System.out.println(funcionario1.calculandoSalario());

System.out.println("------------");
System.out.println(funcionario2.getNome());
System.out.println(funcionario2.getTelefone());
System.out.println(funcionario2.getMatricula());
System.out.println(funcionario2.getEndereco());
System.out.println(funcionario2.calculandoSalario());

System.out.println("------------");
System.out.println(funcionario3.getNome());
System.out.println(funcionario3.getTelefone());
System.out.println(funcionario3.getMatricula());
System.out.println(funcionario3.getEndereco());
System.out.println(funcionario3.calculandoSalario());
	}

}
