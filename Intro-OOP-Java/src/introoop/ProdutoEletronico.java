package introoop;

//Exercício 3 - Classe e Objeto
//Carolina Mira

public class ProdutoEletronico {
	
	private String Nome;
	private String Cor;
	private Integer Tensao;
	private boolean Ligado;
	
	public ProdutoEletronico (String nome, String cor, Integer tensao, Boolean ligado){
		this.Nome = nome;
		this.Cor = cor;
		this.Tensao = tensao;
		this.Ligado = ligado;
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public Integer getTensao() {
		return Tensao;
	}

	public void setTensao(Integer tensao) {
		Tensao = tensao;
	}

	public Boolean isLigado(Boolean ligado) {
		return Ligado;
	}

	public void setLigado() {
		boolean ligado = true;
		Ligado = ligado;
	}
	
	public void status() {
		if(Ligado == false) {
			String status = "Desligado";
			System.out.println("Status: " + status);
		} else {
			String status = "Ligado";
			System.out.println("Status: " + status);
		}
	}
	
	public void setDesligado() {
		boolean ligado = false;
		Ligado = ligado;
	}
	
	public void aplicarTransformador() {
		Integer tensao = Tensao;
		if(tensao == 220) {
			Tensao = 110;
		} else if (tensao == 110) {
			Tensao = 220;
		}
		else {
			System.out.println("Tensão indisponível.");
		}
	}
	
	public void exibirFichaTecnica() {
		System.out.println("**Ficha do Produto**");
		System.out.println("Nome: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tensão: " + getTensao() + " V");
		status();
	}

}
