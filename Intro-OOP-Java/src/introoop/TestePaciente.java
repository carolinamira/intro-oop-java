package introoop;

//Exerc�cio 7 - Classe e Objeto
//Carolina Mira

public class TestePaciente {
	
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("Carolina", "Gon�alves", "Mira", "intoler�ncia � lactose", 34, 0, 9);
		
		paciente1.trocarRemedio();
		paciente1.setIdade();
		paciente1.exibirPaciente();
		paciente1.ganharAlta();
		
	}

}
