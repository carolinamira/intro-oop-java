package inherit_encap;

//Exercício 2 - Herança e Encapsulamento
//Carolina Mira

public class TesteFornecedor {
	
	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor("Paulo", "Henrique", "Pauleto", "Av. Jundiaí, 135", "976489765", 26, 80, 0, 0);
		fornecedor1.setValorCredito();
		fornecedor1.setValorDivida();
		fornecedor1.obterSaldo();
		fornecedor1.emagrecer5();
		fornecedor1.exibirPessoa();
	}
}
