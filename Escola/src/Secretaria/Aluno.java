package Secretaria;

/** Classe para a representacao de um aluno no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 *
 */

public class Aluno {
	
	/** Variaveis para armazenar o nome do aluno */
	private String nome;
	private String dataNascimento;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String responsavel;
	
	/** Construtor  para ativar a variavel nome */
	public Aluno(String nome) {
		setNome(nome);
	}
	/** Metodo para retornar o nome do aluno para a classe teste
	 * @return nome*/
	public String getNome() {
		return nome;
	}
	/** Procedimento para trazer o nome do aluno para armazenar na variavel
	 * @param nome*/
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z ]*")) {
			this.nome = nome;
		}
		
	
	}
	/** Metodo para retornar a data de nascimento nome do aluno para a classe teste
	 * @return dataNascimento*/
	
	public String getDataNascimento() {
		return dataNascimento;
		
	}
	/** Procedimento para trazer data de nascimento do aluno para armazenar na variavel]
	 * @param dataNascimento*/
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.length() >9 && dataNascimento.length() <11 && dataNascimento.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
			this.dataNascimento = dataNascimento;
		}
	}
	
	/** Metodo para retornar o CPF do aluno para a classe teste
	 * @return cpf*/
	public String getCpf() {
		return cpf;
	}
	/** Procedimento para trazer o CPF do aluno para armazenar na variavel
	 * @param cpf*/
	public void setCpf(String cpf) {
		if(cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
		}
	}
	/** Metodo para retornar o endereço do aluno para a classe teste
	 * @return endereco*/
	public String getEndereco() {
		return endereco;
	}
	/** Procedimento para trazer o endereço do aluno para armazenar na variavel
	 * @param endereco*/
	public void setEndereco(String endereco) {
		if(endereco.length()>1) {
			this.endereco = endereco;
		}
		
	}
	/** Metodo para retornar o telefone do aluno para a classe teste
	 * @return telefone*/
	public String getTelefone() {
		return telefone;
	}
	/** Procedimento para trazer o telefone do aluno para armazenar na variavel
	 * @param telefone*/
	public void setTelefone(String telefone) {
		if(telefone.matches("[0-9]{2} [0-9]{5}-[0-9]{4}")) {
			this.telefone = telefone;
		}
	}
	/** Metodo para retornar o emai do aluno para a classe teste
	 * @return email*/
	public String getEmail() {
		return email;
	}
	/** Procedimento para trazer o email do aluno para armazenar na variavel
	 * @param email*/
	public void setEmail(String email) {
		if(email.matches("^[A-za-z0-9+._-]+@[A-za-z]+.[A-Za-z.]+")) {
			this.email = email;
		}
		
	}
	/** Metodo para retornar o nome do responsável do aluno para a classe teste
	 * @return responsavel*/
	public String getResponsavel() {
		return responsavel;
	}
	/** Procedimento para trazer o nome do responsável do aluno para armazenar na variavel
	 * @param responsavel*/
	public void setResponsavel(String responsavel) {
		if (responsavel.matches("[A-Za-z ]*") && responsavel.length()>1) {
			this.responsavel = responsavel;
		}
		
	}


	

}
