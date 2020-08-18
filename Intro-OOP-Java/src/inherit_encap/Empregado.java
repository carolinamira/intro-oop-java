package inherit_encap;
import java.util.Scanner;

//Exercício 3 - Herança e Encapsulamento
//Carolina Mira

public class Empregado extends Pessoa {
	
	private Integer codigoSetor;
	private Double salarioBase;
	private Double Imposto;
	
	Scanner entrada = new Scanner(System.in);

	public Empregado(String primeironome, String nomedomeio, String ultimonome, String endereco, String telefone,
			Integer idade, Integer peso, Integer codigosetor, Double salariobase, Double imposto) {
		super(primeironome, nomedomeio, ultimonome, endereco, telefone, idade, peso);
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigosetor) {
		this.codigoSetor = codigosetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salariobase) {
		this.salarioBase = salariobase;
	}

	public double getImposto() {
		return Imposto;
	}

	public void setImposto() {
		System.out.println("Digite o imposto a ser aplicado no salário: ");
		double imposto = entrada.nextDouble();
		Imposto = imposto;
	}
	
	public void calcularSalario() {
		double salarioFinal = getSalarioBase() - (getImposto()*getSalarioBase());	
		System.out.println("O valor do salário final é: " + salarioFinal);
	}

}
