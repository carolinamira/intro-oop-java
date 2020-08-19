package inherit_polimorf;

//Exerc�cio 1 - Heran�a e Polimorfismo
//Carolina Mira

public class Cavalo extends Animal {

	public Cavalo(String nome, Integer idade) {
		super(nome, idade);
		
	}
	
	public void emitirSom(String som) {
		System.out.println("Cavalo " + getNome() + ": "+ som);
	}

	public void correr() {
		System.out.println("Cavalo correndo!");
	}
}
