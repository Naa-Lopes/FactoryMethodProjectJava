package factorymethod;

/*Esta classe centraliza a criação de objetos `Car` 
 * atendendo às requisições do cliente. Elimina a necessidade de instanciar 
 * novos objetos diretamente, promovendo maior organização e controle.
 */

public abstract class CarCreator {
	
	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();
}
