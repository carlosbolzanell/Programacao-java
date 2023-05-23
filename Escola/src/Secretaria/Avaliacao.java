package Secretaria;

/** Classe para a representacao da avaliação no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 */
public class Avaliacao {
	
	/** Variaveis para armazenar as propriedades da avaliação */
	private String nome;
	private UnidadeCurricular uc;
	
	/** Construtor para ativar as váriaveis nome e unidade curricular*/
	public Avaliacao(String nome, UnidadeCurricular uc) {
		super();
		this.nome = nome;
		this.uc = uc;
	}

	/** Metodo para retornar o nome da avaliação para a classe teste
	 * @return nome*/
	public String getNome() {
		return nome;
	}

	/** Procedimento para trazer o nome da avaliação para armazenar na variavel
	 * @param nome*/
	public void setNome(String nome) {
		if(nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")){
			this.nome = nome;
		}
	}

	/** Metodo para retornar o nome da unidade curricular para a classe teste
	 * @return uc*/
	public UnidadeCurricular getUc() {
		return uc;
	}

	/** Procedimento para trazer o nome da unidade curricular para armazenar na variavel
	 * @param uc*/
	public void setUc(UnidadeCurricular uc) {
		this.uc = uc;
	}
	
}
