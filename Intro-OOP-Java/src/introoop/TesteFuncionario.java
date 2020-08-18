package introoop;

//Exercício 4 - Classe e Objeto
//Carolina Mira

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("Maria", "Fernanda", "Oliveira", "12345", "123.456.789-0");
				
		System.out.println("O nome do(a) funcionário(a) é " + funcionario1.getNomeCompleto() + ".");
		System.out.println("O registro do(a) funcionário(a) é: " + funcionario1.getNumeroRegistro());
		System.out.println("O CPF do funcionário(a) é: " + funcionario1.getCPF());
		funcionario1.setNumeroRegistro();
		funcionario1.exibirFuncionario();

	}
}
