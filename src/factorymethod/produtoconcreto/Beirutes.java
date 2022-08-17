package factorymethod.produtoconcreto;

import factorymethod.Produto;

public class Beirutes implements Produto{
	
	private String nomeBeiture;
	private double peso;
	private double precoBeirute;
	
	
	
	public String getNomeBeiture() {
		return nomeBeiture;
	}
	public void setNomeBeiture(String nomeBeiture) {
		this.nomeBeiture = nomeBeiture;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecoBeirute() {
		return precoBeirute;
	}
	public void setPrecoBeirute(double precoBeirute) {
		this.precoBeirute = precoBeirute;
	}

	
	
	
	public int montaFood(String tipo, double peso) {
		// TODO Auto-generated method stub
	
		this.setNomeBeiture(tipo);
		this.setPeso(peso);
		
		int codigo = 0;
		if (tipo.equalsIgnoreCase("frango") && peso == 175) {
			
			System.out.println("Beirute de Frango!");
			codigo = 1;
			
		}
	if (tipo.equalsIgnoreCase("frango") && peso == 900) {
			
			System.out.println("Clone de beiture de frango");
			codigo = 2;
		}
	return codigo;
	}
	
	
	@Override
	public double calculaPreco(int codigo) {
		// TODO Auto-generated method stub
		
		double preco = 0;
		
		
		if(codigo == 1) {
			
			preco = 15;
		}
if(codigo == 2) {
			
			preco = 35;
		}
	
 

		
		return preco;
	}
	@Override
	public void calculaPrecoComFrete(int codigo, double distancia) {	
		
		double precoComFrete = 0;
		double frete = distancia * 1.75;
	
		precoComFrete = calculaPreco(codigo) + frete;
		
		this.setPrecoBeirute(precoComFrete);
		
		System.out.println("Valor do frete: R$ " + frete);
		
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "nomeBeiture: " + nomeBeiture + "\n peso: " + peso + "\n precoBeirute: " + precoBeirute ;
	}
	
	
	
	
	
	

}
