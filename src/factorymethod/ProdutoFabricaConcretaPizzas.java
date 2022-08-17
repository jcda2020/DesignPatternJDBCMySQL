package factorymethod;

import factorymethod.produtoconcreto.Pizzas;

public class ProdutoFabricaConcretaPizzas extends ProductCreatorAbstract{	


	@Override
	protected Produto createProduto() {
		// TODO Auto-generated method stub			
				
		return new Pizzas(); //xwz@111		
		
		
	
	}

	


	
	
   
	
	
	
}
