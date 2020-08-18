package introoop;

//Exercício 3 - Classe e Objeto
//Carolina Mira

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico chapinha = new ProdutoEletronico("Chapinha", "Azul", 110, false);
		chapinha.setLigado();
		chapinha.exibirFichaTecnica();
		chapinha.setDesligado();
		chapinha.exibirFichaTecnica();
		chapinha.aplicarTransformador();
		chapinha.exibirFichaTecnica();
	}
}
