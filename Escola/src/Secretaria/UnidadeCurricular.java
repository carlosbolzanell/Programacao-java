package Secretaria;

/** Classe para a representacao da unidade curricular no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 */

public class UnidadeCurricular {
	
	/** Variaveis para armazenar as propriedades da unidade curricular */
	private String nome;
	private Curso curso;

	/** Construtor para ativar as váriaveis nome e curso*/
	public UnidadeCurricular(String nome, Curso curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}

	/** Metodo para retornar o nome da unidade curricular para a classe teste
	 * @return nome*/
	public String getNome() {
		return nome;
	}

	/** Procedimento para trazer o nome da unidade curricular para armazenar na variavel
	 * @param nome*/
	public void setNome(String nome) {
		if(nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}
	}
	
	/** Metodo para retornar o nome do curso da unidade curricular para a classe teste
	 * @return curso*/
	public Curso getCurso() {
		return curso;
	}

	/** Procedimento para trazer o nome do curso da unidade curricular para armazenar na variavel
	 * @param curso*/
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	

}
