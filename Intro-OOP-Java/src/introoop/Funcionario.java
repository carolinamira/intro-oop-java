package introoop;
import java.util.Scanner;

//Exercício 4 - Classe e Objeto
//Carolina Mira

public class Funcionario {
	
	private String primeiroNome;
	private String nomedoMeio;
	private String ultimoNome;	
	private String numeroRegistro;
	private String CPF;
	
	Scanner ler = new Scanner(System.in);
	
	public Funcionario(String primeironome, String nomedomeio, String ultimonome, String numeroregistro, String cpf) {
		
		this.primeiroNome = primeironome;
		this.nomedoMeio = nomedomeio;
		this.ultimoNome = ultimonome;
		this.numeroRegistro = numeroregistro;	
		this.CPF = cpf;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeironome) {
		this.primeiroNome = primeironome;
	}
	public String getNomedoMeio() {
		return nomedoMeio;
	}
	public void setNomedoMeio(String nomedomeio) {
		this.nomedoMeio = nomedomeio;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimonome) {
		this.ultimoNome = ultimonome;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro() {
		System.out.println("Digite um novo número de registro: ");
		String numeroregistro = ler.nextLine();
		this.numeroRegistro = numeroregistro;
		System.out.println("Registro atualizado! Novo número: " + numeroregistro);
	}
	
	public String getCPF(){
		return CPF;
	}
	
	public void setCPF(String cpf) {
		if (cpf.length() == 11 || cpf.length() == 14) {
			this.CPF = cpf;
		}
		else {
			System.out.println("Digite um CPF válido.");
		}
	}
	
	public String getNomeCompleto() {
		return primeiroNome + " " + nomedoMeio + " " + ultimoNome;
	}
	
	
	public void exibirFuncionario() {
		System.out.println("**Dados cadastrais - Funcionários**");
		System.out.println("Nome completo: " + getNomeCompleto());
		System.out.println("CPF " + getCPF());
		System.out.println("Número de registro: " + numeroRegistro);
		
	}
}
