package app;

import java.util.Scanner;

import factorymethod.ProductCreatorAbstract;
import factorymethod.Produto;
import factorymethod.ProdutoFabricaConcretaBeirutes;
import factorymethod.ProdutoFabricaConcretaPizzas;
import factorymethod.produtoconcreto.Beirutes;
import factorymethod.produtoconcreto.Pizzas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ProductCreatorAbstract food = null;
		
		Scanner leia  = new Scanner(System.in);
		
		int opcaoFood;
		double peso, distancia;
		String nome;

		System.out.println("Digite uma das opções: \n 1 - para pizzas \n 2- para beirutes: ");
		opcaoFood = leia.nextInt();

		if (opcaoFood == 1) {
				
			food = new ProdutoFabricaConcretaPizzas();	
			
			

			System.out.println("Digite o sabor: Mussarela, Mista... ");
			nome = leia.next();

			System.out.println("Digite o pesso (em gramas): 175 ou 900 ");
			peso = leia.nextDouble();

			System.out.println("Digite a distância, em quilômetro:  ");
			distancia = leia.nextDouble();

			if (distancia <= 3) {

				distancia = 0;
				System.out.println("Opa! Frete grátis!");
			}
			
			
			Pizzas pizza = new Pizzas();
			
			pizza =  (Pizzas) food.startProduto(nome, peso, distancia);		
			
			
			System.out.println(pizza.toString());
			
			
			
			
			
			
	
		}
		
		if (opcaoFood == 2) {
			food = new ProdutoFabricaConcretaBeirutes();
			System.out.println("Digite o tipo: Frango, carne... ");
			nome = leia.next();

			System.out.println("Digite o pesso (em gramas): 175 ou 900 ");
			peso = leia.nextDouble();

			System.out.println("Digite a distância, em quilômetro:  ");
			distancia = leia.nextDouble();

			if (distancia <= 3) {

				distancia = 0;
				System.out.println("Opa! Frete grátis!");
			}
			
			
			Beirutes beiture = new Beirutes();
			
			beiture = (Beirutes) food.startProduto(nome, peso, distancia);
			
			System.out.println(beiture.toString());
		}
		
		
	}

}
