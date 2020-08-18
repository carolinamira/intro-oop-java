package inherit_encap;

//Exercício 3 - Herança e Encapsulamento
//Carolina Mira

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Vanessa", "Lezier", "Dini", "Av. 9 de Julho, 1299", "834568374", 25, 60, 0, 0.0, 0.0); 
		empregado1.emagrecer5();
		empregado1.exibirPessoa();
		empregado1.setCodigoSetor(4599);
		System.out.println(empregado1.getCodigoSetor());
		empregado1.setSalarioBase(1000.00);
		empregado1.setImposto();
		empregado1.calcularSalario();

	}

}
