package inherit_polimorf;

//Exercício 2 - Herança e Polimorfismo
//Carolina Mira

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Billy", 5);
		Cavalo horse = new Cavalo("Spirit", 10);
		Preguica lazy = new Preguica("Carol", 9);
		
		dog.emitirSom("Au!");
		horse.emitirSom("Hihihi!");
		lazy.emitirSom("Que sono!");
		
		dog.correr();
		horse.correr();
		lazy.subirArvores();
	}
}
