package factorymethod;

public interface Produto {

	
	int montaFood(String tipo, double peso);
	double calculaPreco(int codigo);
	void calculaPrecoComFrete(int codigo, double distancia);
	
	
	
}
