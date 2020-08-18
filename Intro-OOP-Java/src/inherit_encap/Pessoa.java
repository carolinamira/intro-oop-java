package inherit_encap;
import java.util.Scanner;

//Exercício 1 - Herança e Encapsulamento
//Carolina Mira


public class Pessoa {
	private String primeiroNome;
	private String nomedoMeio;
	private String ultimoNome;
	private String Endereco;
	private String Telefone;
	private Integer Idade;
	private Integer Peso;
	
	Scanner entrada = new Scanner(System.in);
	
	public Pessoa(String primeironome, String nomedomeio, String ultimonome, String endereco, String telefone,
			Integer idade, Integer peso) {
	
		this.primeiroNome = primeironome;
		this.nomedoMeio = nomedomeio;
		this.ultimoNome = ultimonome;
		this.Endereco = endereco;
		this.Telefone = telefone;
		this.Idade = idade;
		this.Peso = peso;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getNomedoMeio() {
		return nomedoMeio;
	}

	public void setNomedoMeio(String nomedoMeio) {
		this.nomedoMeio = nomedoMeio;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco() {
		System.out.println("Digite o novo endereço: ");
		String endereco = entrada.nextLine();
		Endereco = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	public Integer getPeso() {
		return Peso;
	}

	public void setPeso(Integer peso) {
		Peso = peso;
	}
	
	public String getNomeCompleto() {
		return primeiroNome + " " + nomedoMeio + " " + ultimoNome;	
		}
	
	public void exibirPessoa() {
		System.out.println("**Dados Pessoais**");
		System.out.println("Nome completo: " + getNomeCompleto());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Peso: " + getPeso() + " kg");
	}
	
	public void emagrecer5() {
		getPeso();
		Peso = Peso - 5;
		setPeso(Peso);
	}
	
}
