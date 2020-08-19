package inherit_polimorf;

//Exercício 1 - Herança e Polimorfismo
//Carolina Mira

public class Preguica extends Animal {

	public Preguica(String nome, Integer idade) {
		super(nome, idade);
		
	}

	public void emitirSom(String som) {
		System.out.println("Preguiça " + getNome() + ": " + som);
	}

	public void subirArvores() {
		System.out.println("Preguiça subindo a árvore!");
	}
}
