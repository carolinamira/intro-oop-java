package inherit_polimorf;

//Exerc�cio 1 - Heran�a e Polimorfismo
//Carolina Mira

//Classe abstrata para aplicar polimorfismo
public abstract class Animal {
	
	private String Nome;
	private Integer Idade;
	
	public Animal(String nome, Integer idade) {
		this.Nome = nome;
		this.Idade = idade;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public Integer getIdade() {
		return Idade;
	}
	public void setIdade(Integer idade) {
		this.Idade = idade;
	}
	
	//M�todo abstrato para polimorfismo
	abstract public void emitirSom(String som);
	
}
