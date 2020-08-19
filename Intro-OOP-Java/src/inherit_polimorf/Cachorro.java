package inherit_polimorf;

//Exercício 1 - Herança e Polimorfismo
//Carolina Mira

public class Cachorro extends Animal {

	public Cachorro(String nome, Integer idade) {
		super(nome, idade);
		
	}
	
	public void emitirSom(String som) {
		System.out.println("Cachorro " + getNome() + ": " + som);
	}
	
	public void correr() {
		System.out.println("Cachorro correndo!");
	}
}
