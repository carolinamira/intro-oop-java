package inherit_polimorf;

//Exerc�cio 1 - Heran�a e Polimorfismo
//Carolina Mira

public class Preguica extends Animal {

	public Preguica(String nome, Integer idade) {
		super(nome, idade);
		
	}

	public void emitirSom(String som) {
		System.out.println("Pregui�a " + getNome() + ": " + som);
	}

	public void subirArvores() {
		System.out.println("Pregui�a subindo a �rvore!");
	}
}
