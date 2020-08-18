package introoop;
import java.util.Scanner;

//Exerc�cio 7 - Classe e Objeto
//Carolina Mira

public class Paciente {
	
	private String primeiroNome;
	private String nomedoMeio;
	private String ultimoNome;	
	private String Doenca;	
	private Integer Cid;
	private Integer Idade;
	private Integer Tempotratamento;
	
	Scanner ler = new Scanner (System.in);
	
	public Paciente(String primeiro, String meio, String ultimo, String doenca, Integer cid, Integer idade, Integer tempotratamento) {
		this.primeiroNome = primeiro;
		this.nomedoMeio = meio;
		this.ultimoNome = ultimo;
		this.Doenca = doenca;
		this.Cid = cid;
		this.Idade = idade;
		this.Tempotratamento = tempotratamento;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiro) {
		this.primeiroNome = primeiro;
	}

	public String getNomedoMeio() {
		return nomedoMeio;
	}

	public void setNomedoMeio(String meio) {
		this.nomedoMeio = meio;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimo) {
		this.ultimoNome = ultimo;
	}

	public String getDoenca() {
		return Doenca;
	}

	public void setDoenca(String doenca) {
		this.Doenca = doenca;
	}

	public Integer getCid() {
		return Cid;
	}

	public void setCid(Integer cid) {
		this.Cid = cid;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade() {
		System.out.println("Digite a idade do paciente: ");
		Integer idade = ler.nextInt();
		while(idade <= 0 || idade >= 120) {
			System.out.println("Idade inv�lida! Digite uma nova idade.");	
			idade = ler.nextInt();
		} 
			this.Idade = idade;
	}
		
	public Integer getTempotratamento() {
		return Tempotratamento;
	}

	public void setTempotratamento(Integer tempotratamento) {
		Tempotratamento = tempotratamento;
	}

	public String getNomeCompleto() {
		return primeiroNome + " " + nomedoMeio + " " + ultimoNome;
	}
	
	public void exibirPaciente() {
		System.out.println("**Dados cadastrais - Pacientes**");
		System.out.println("Nome completo: " + getNomeCompleto());
		System.out.println("Idade: " + getIdade());
		System.out.println("Doen�a: " + getDoenca() + " - c�digo: " + getCid());
		System.out.println("Tempo de tratamento: " + getTempotratamento() + " meses.");		
	}
	
	public void trocarRemedio() {
		if (Tempotratamento >= 6 && Tempotratamento <= 10) {
			System.out.println("O tempo do tratamento com este rem�dio acabou! Digite o novo rem�dio para o paciente: ");
			String novoremedio = ler.nextLine();
			System.out.println("O paciente deve come�ar a tomar o rem�dio " + novoremedio + ".");
		}
		else if (Tempotratamento < 6) {
			System.out.println("Continuar o tratamento at� a pr�xima consulta.");
		} else {
			System.out.println("O paciente n�o precisa mais da medica��o.");
		}
	}
	
	public void ganharAlta() {
		if(Tempotratamento > 10) {
			System.out.println("O paciente pode ser liberado.");			
		} else {
			System.out.println("O paciente deve continuar o tratamento.");
		}
	}
	
}
