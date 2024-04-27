package factorymethod;

/* Representa o cliente que solicita a criação de um objeto `Car`. 
 * Essa classe abstrai os detalhes da construção do objeto, permitindo que o cliente 
 * receba o produto final e suas funcionalidades sem precisar se preocupar com a 
 * implementação interna. 
 */

public class Client {

	public static void main(String[] args) {

		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}
	
}
