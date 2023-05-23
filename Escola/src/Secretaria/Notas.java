package Secretaria;

/** Classe para a representacao das notas no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 */
public class Notas {
	
	/** Variaveis para armazenar as propriedades das notas */
	private Aluno aluno;
	private Avaliacao avaliacao;
	private float nota;
	
	/** Construtor para ativar as váriaveis aluno, avaliação e nota*/
	public Notas(Aluno aluno, Avaliacao avaliacao, float nota) {
		super();
		this.aluno = aluno;
		this.avaliacao = avaliacao;
		this.nota = nota;
	}
	
	/** Metodo para retornar o nome do aluno para a classe teste
	 * @return aluno*/
	public Aluno getAluno() {
		return aluno;
	}

	/** Procedimento para trazer o nome do aluno para armazenar na variavel
	 * @param aluno*/
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/** Metodo para retornar o nome da avaliação para a classe teste
	 * @return avaliacao*/
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	/** Procedimento para trazer o nome da avaliação para armazenar na variavel
	 * @param avaliacao*/
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	/** Metodo para retornar a nota do aluno para a classe teste
	 * @return nota*/
	public float getNota() {
		return nota;
	}

	/** Procedimento para trazer o nota do aluno para armazenar na variavel
	 * @param nota*/
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	

}
