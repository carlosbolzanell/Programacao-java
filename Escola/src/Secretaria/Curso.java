package Secretaria;

/** Classe para a representacao da matrícula do aluno no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 */


public class Curso {
	
	/** Variaveis para armazenar as propriedades dos cursos */
	private int cargaHoraria;
	private String materia, nome;
	
	/** Metodo para retornar a carga horaria do curso para a classe teste
	 * @return cargaHoraria*/
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	/** Procedimento para trazer a carga horaria do curso para armazenar na variavel
	 * @param cargaHoraria*/
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria > 0) {
			this.cargaHoraria = cargaHoraria;
		}
	}
	
	/** Metodo para retornar a matéria do curso para a classe teste
	 * @return materia*/
	public String getMateria() {
		return materia;
	}
	
	/** Procedimento para trazer a matéria do curso para armazenar na variavel
	 * @param materia*/
	public void setMateria(String materia) {
		if(materia.matches("[A-Za-z çÇãõâêôéáíó]*")) {
			this.materia = materia;
		}
	}
	/** Metodo para retornar o nome do curso para a classe teste
	 * @return nome*/
	public String getNome() {
		return nome;
	}
	/** Procedimento para trazer o nome do curso para armazenar na variavel
	 * @param nome*/
	public void setNome(String nome) {
		if(nome.matches("[A-Za-z ãõéáóíç]*")) {
			this.nome = nome;
		}
	}	

}
