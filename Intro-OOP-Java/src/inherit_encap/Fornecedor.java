package inherit_encap;

//Exercício 2 - Herança e Encapsulamento
//Carolina Mira

public class Fornecedor extends Pessoa {
		
		private double valorCredito;
		private double valorDivida;
		
		
	public Fornecedor(String primeironome, String nomedomeio, String ultimonome, String endereco, String telefone,
			Integer idade, Integer peso, double valorcredito, double valordivida) {
		super(primeironome, nomedomeio, ultimonome, endereco, telefone, idade, peso);		
	}


	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito() {
		System.out.println("Digite o valor de crédito do fornecedor: ");
		double valorcredito = entrada.nextDouble();
		this.valorCredito = valorcredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida() {
		System.out.println("Digite o valor de dívida do fornecedor: ");
		double valordivida = entrada.nextDouble();
		this.valorDivida = valordivida;
	}
	
	public void obterSaldo() {
		double saldoFinal = (valorCredito - valorDivida);
		System.out.println("O saldo do fornecedor " + getNomeCompleto() + " é: " + saldoFinal);
	}

}
