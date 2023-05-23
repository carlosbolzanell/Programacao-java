package Secretaria;

/** Classe para a representacao da matrícula do aluno no sistema escolar
 * 
 * @author Carlos Eduardo Bolzanell
 */

public class Matricula {
	
	/** Variaveis para armazenar as propriedades da matrícula do aluno */
	private int numero;
	private String curso, turma;
	
	/** Metodo para retornar o número da matrícula para a classe teste
	 * @return numero*/
	public int getNumero() {
		return numero;
	}
	/** Procedimento para trazer o número da matrícula para armazenar na variavel
	 * @param numero*/
	public void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}else {
		}
	}
	
	/** Metodo para retornar o curso da matrícula para a classe teste
	 * @return curso*/
	public String getCurso() {
		return curso;
	}
	/** Procedimento para trazer o curso da matrícula para armazenar na variavel
	 * @param numero*/
	public void setCurso(String curso) {
		if(curso.matches("[A-Za-z ]*")) {
			this.curso = curso;
		}else {
		}
		
	}
	/** Metodo para retornar a turma da matrícula para a classe teste
	 * @return turma*/
	public String getTurma() {
		return turma;
	}
	/** Procedimento para trazer a turma da matrícula para armazenar na variavel
	 * @param numero*/
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	@Override
	public String toString() {
		return " Matricula\n Numero=" + numero + "\n Curso=" + curso + "\n Turma=" + turma;
	}
	

}
