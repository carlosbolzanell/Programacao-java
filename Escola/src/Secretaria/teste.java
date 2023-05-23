package Secretaria;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno("Carlos Bolzanell");
		Curso curso1 = new Curso("Programação de Sistemas");
		UnidadeCurricular uc1 = new UnidadeCurricular("Programação Orientada a Objeto", curso1);
		Matricula matricula1 = new Matricula(aluno1, uc1);
		Avaliacao prova1 = new Avaliacao("Prova 1", uc1);
		Notas nota1 = new Notas(aluno1, prova1, (float) 9.0);
		
// -------------------Aluno-----------------------------//	
		System.out.println("\nALUNO:\n");
		
		if(aluno1.getNome() == null) {
			System.out.println("Nome inválido");
		}else {
			System.out.println(aluno1.getNome());
		}
		
		aluno1.setDataNascimento("16/11/2005");
		if(aluno1.getDataNascimento() == null) {
			System.out.println("Data de nascimento inválido");
		}else {
			System.out.println(aluno1.getDataNascimento());
		}
		
		aluno1.setCpf("118.553.079-79");
		if(aluno1.getCpf() == null) {
			System.out.println("CPF inválido");
		}else {
			System.out.println(aluno1.getCpf());
		}
		
		aluno1.setEmail("carlosbolzanell@gmail.com");
		if(aluno1.getEmail() == null) {
			System.out.println("E-main inválido");
		}else {
			System.out.println(aluno1.getEmail());
		}
		
		aluno1.setEndereco("Frederico barg 85");
		if(aluno1.getEndereco() == null) {
			System.out.println("Endereço inválido");
		}else {
			System.out.println(aluno1.getEndereco());
		}
		
		aluno1.setResponsavel("Roseli de Souza Ortiz");
		if(aluno1.getResponsavel() == null) {
			System.out.println("Responsável inválido");
		}else {
			System.out.println(aluno1.getResponsavel());
		}
		
		aluno1.setTelefone("47 99771-8238");
		if(aluno1.getTelefone() == null) {
			System.out.println("Telefone inválido");
		}else {
			System.out.println(aluno1.getTelefone());
		}
		
		
//---------------------Curso----------------------//		
		
		System.out.println("\nCURSO:\n");

		if(curso1.getNome() == null) {
			System.out.println("Telefone inválido");
		}else {
			System.out.println(curso1.getNome());
		}
		
//----------------------Matricula-----------------//		
		
		System.out.println("\nMATRICULA:\n");
		
		
		matricula1.setCodigo("S12345");
		
		if(matricula1.getCodigo() == null) {
			System.out.println("Matricula inválido");
		}else {
			System.out.println(matricula1.getCodigo());
		}
		
		if(matricula1.getAluno() == null) {
			System.out.println("Aluno inválido");
		}else {
			System.out.println(matricula1.getAluno().getNome());
		}
		
		if(matricula1.getUnidadeCurricular() == null) {
			System.out.println("Curso inválido");
		}else {
			System.out.println(matricula1.getUnidadeCurricular().getNome());
		}
		
//------------------Unidade Curricular-------------------------//		
		
		System.out.println("\nUNIDADE CURRICULAR\n");
		
		if(uc1.getNome() == null) {
			System.out.println("Nome de Unidade Curricular inválido!");
		}else {
			System.out.println(uc1.getNome());
		}
		
		if(uc1.getCurso() == null) {
			System.out.println("Curso inválido!");
		}else {
			System.out.println(uc1.getCurso().getNome());
		}
		
//---------------------Avaliação------------------//		
		
		System.out.println("\nAVALIAÇÃO\n");
		
		if(prova1.getNome() == null) {
			System.out.println("Nome inválido!!");
		}else {
			System.out.println(prova1.getNome());
		}
		
		if(prova1.getUc() == null) {
			System.out.println("Unidade Curricular inválida!!");
		}else {
			System.out.println(prova1.getUc().getNome());
		}

//------------------Notas--------------------//
		
		System.out.println("\nNOTAS\n");
		
		if(nota1.getAluno() == null) {
			System.out.println("Aluno inválido!");
		}else {
			System.out.println(nota1.getAluno().getNome());
		}
		
		if(nota1.getAvaliacao() == null) {
			System.out.println("Avaliação inválida!");
		}else {
			System.out.println(nota1.getAvaliacao().getNome());
		}
		
		if(nota1.getNota() < 0.0 && nota1.getNota() > 10.0) {
			System.out.println("Nota inválida");
		}else {
			System.out.println(nota1.getNota());
		}

	}

}
