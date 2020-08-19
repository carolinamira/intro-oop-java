package inherit_polimorf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Exerc�cio 3 - Heran�a e polimorfismo
//Carolina Mira

public class TesteLoja {
	
	public static void main(String[] args) {
		
		List<String> estoque = new ArrayList<String>(); 
		Scanner entrada = new Scanner(System.in);
		
		estoque.add("Batom");
		estoque.add("R�mel");
		estoque.add("Esmalte");
		estoque.add("Blush");
		estoque.add("Base");
		estoque.add("Iluminador");
		estoque.add("Sombra");
		estoque.add("L�pis de olho");
		
		System.out.println("**Sistema - Loja Beauty Products**\nDigite a fun��o desejada:\n1-- Retirar produto para venda\n2-- Consultar lista de produtos\n3-- Adicionar no estoque\n4-- Procurar no estoque");
		Integer numero = entrada.nextInt();
		switch(numero) {
		
		case 1:
		System.out.println("Digite o nome do produto: ");
		String retirar = entrada.next();
		if (estoque.contains(retirar)) {
			estoque.remove(retirar);
			System.out.println("Produto " + retirar +" retirado para venda!");
			System.out.println("Estoque atual: " + estoque);
		}else {
			System.out.println("Este produto acabou. Consulte o estoque na op��o 2.");
		}
		break;
			
		case 2:
			
		System.out.println("Estoque atual: " + estoque);
		
		break;
		
		case 3:
		System.out.println("Digite o produto a ser adicionado: ");
		String adicao = entrada.next();
		estoque.add(adicao);
		System.out.println("O produto " + adicao + " foi colocado no estoque.");
		System.out.println("Estoque atual: " + estoque);
		break;
		
		case 4:
		System.out.println("Digite o produto que est� procurando: ");
		String busca = entrada.next();
		
		if(estoque.contains(busca)) {
			System.out.println("O produto " + busca + " est� no estoque.");			
		} else {
			System.out.println("O produto " + busca + " acabou. Por gentileza entre em contato com o fornecedor.");
		}
		break;
		
		default:
		System.out.println("Op��o inv�lida! Digite novamente.");
		
		entrada.close();
		}	

	}

}
