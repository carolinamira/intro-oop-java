package inherit_encap;

//Exercício 1 - Herança e Encapsulamento
//Carolina Mira

public class TestePessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Carolina", "Gonçalves", "Mira", "Rua do Retiro, 1371", "994649891", 28, 48);
		pessoa1.exibirPessoa();
		pessoa1.emagrecer5();
		pessoa1.setEndereco();
		pessoa1.exibirPessoa();
	}
}
