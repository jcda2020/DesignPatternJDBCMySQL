package factorymethod;

import factorymethod.produtoconcreto.Beirutes;

public class ProdutoFabricaConcretaBeirutes extends ProductCreatorAbstract{

	@Override
	protected Produto createProduto() {
		// TODO Auto-generated method stub
		return new Beirutes();
	}

}
