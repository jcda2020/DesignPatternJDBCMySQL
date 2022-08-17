package factorymethod.produtoconcreto;

import factorymethod.Produto;

public class Pizzas implements Produto {	
	
	
	
	
	private String nomePizza;
	private double peso;
	private double precoPizza;	
	

	
	public String getNomePizza() {
		return nomePizza;
	}
	public void setNomePizza(String nomePizza) {
		this.nomePizza = nomePizza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecoPizza() {
		return precoPizza;
	}
	public void setPrecoPizza(double precoPizza) {
		this.precoPizza = precoPizza;
	}
	
	
	
	@Override
	public int montaFood(String tipo, double peso) {
		// TODO Auto-generated method stub
	
		this.setNomePizza(tipo);
		this.setPeso(peso);
		
		int codigo = 0;
		if (tipo.equalsIgnoreCase("mussarela") && peso == 175) {
			
			System.out.println("Pizza pequena de mussarela com 4 fatias");
			codigo = 1;
			
		}
	if (tipo.equalsIgnoreCase("mussarela") && peso == 900) {
			
			System.out.println("Pizza grande de mussarela com 8 fatias");
			codigo = 2;
		}
	return codigo;
	}
	
	
	@Override
	public double calculaPreco(int codigo) {
		// TODO Auto-generated method stub
		
		double preco = 0;
		
		
		if(codigo == 1) {
			
			preco = 8.5;
		}
if(codigo == 2) {
			
			preco = 45;
		}
	
 

		
		return preco;
	}
	@Override
	public void calculaPrecoComFrete(int codigo, double distancia) {	
		
		double precoComFrete = 0;
		double frete = distancia * 1.75;
	
		precoComFrete = calculaPreco(codigo) + frete;
		
		this.setPrecoPizza(precoComFrete);
		
		System.out.println("Valor do frete: R$ " + frete);
		
		
		
	}
	@Override
	public String toString() {
		return "nomePizza: " + nomePizza + "\n peso: " + peso + "\n precoPizza: " + precoPizza ;
	}
	
	
	
	
}
