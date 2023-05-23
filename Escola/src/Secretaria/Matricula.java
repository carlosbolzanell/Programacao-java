package Secretaria;

/** Classe para a representacao da matrícula do aluno no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 */

public class Matricula {
	
	/** Variaveis para armazenar as propriedades da matrícula do aluno */
	private String codigo;
	private Aluno aluno;
	private UnidadeCurricular uc;
	
	/** Construtor para ativar as váriaveis aluno e unidade curricular*/
	public Matricula(Aluno aluno, UnidadeCurricular uc) {
		super();
		this.setAluno(aluno);
		this.setUnidadeCurricular(uc);
	}
	
	/** Metodo para retornar o número da matrícula para a classe teste
	 * @return codigo*/
	public String getCodigo() {
		return codigo;
	}
	/** Procedimento para trazer o número da matrícula para armazenar na variavel
	 * @param codigo*/
	public void setCodigo(String codigo) {
		if(codigo.matches("[A-Z]{1}[0-9]{5}")) {
			this.codigo = codigo;
		}
	}
	/** Metodo para retornar o nome do aluno para a classe teste
	 * @return aluno*/
	public Aluno getAluno() {
		return aluno;
	}
	/** Procedimento para trazer o nome do aluno para armazenar na variavel
	 * @param aluno*/
	public void setAluno(Aluno aluno) {
		if(aluno != null) {
			this.aluno = aluno;
		}
	}
	/** Metodo para retornar a unidade curricular para a classe teste
	 * @return curso*/
	public UnidadeCurricular getUnidadeCurricular() {
		return uc;
	}
	/** Procedimento para trazer a unidade curricular para armazenar na variavel
	 * @param curso*/
	public void setUnidadeCurricular(UnidadeCurricular uc) {
		this.uc = uc;
	}


}
