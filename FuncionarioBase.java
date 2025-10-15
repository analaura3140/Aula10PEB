package aula05Atividades;

public abstract class FuncionarioBase implements InterfaceFuncionario {
private long id;
private String nome;
private String telefone;
private int matricula;
private String endereco;

public FuncionarioBase(long id, String nome, String telefone, int matricula, String endereco) {
	this.id = id;
	this.nome = nome;
	this.telefone = telefone;
	this.matricula = matricula;
	this.endereco = endereco;
}

public String getNome() {
	return nome;
}

public String getTelefone() {
	return telefone;
}

public long getId() {
	return id;
}

public int getMatricula() {
	return matricula;
}

public String getEndereco() {
	return endereco;
}

}
