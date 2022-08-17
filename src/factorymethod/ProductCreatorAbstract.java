package factorymethod;

public abstract class ProductCreatorAbstract{


	protected abstract Produto createProduto();
	
	
	
	public Object startProduto(String nome, double peso, double distancia) {
		
		Produto produto = createProduto();
		
		int codigo = produto.montaFood(nome, peso);
		
		produto.calculaPrecoComFrete(codigo, distancia);
		
		
		Object prod = produto;
		
		 return prod;
		
	}



	
	
	
}
