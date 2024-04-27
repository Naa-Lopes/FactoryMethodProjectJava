package factorymethod;

/*Esta classe centraliza a cria��o de objetos `Car` 
 * atendendo �s requisi��es do cliente. Elimina a necessidade de instanciar 
 * novos objetos diretamente, promovendo maior organiza��o e controle.
 */

public abstract class CarCreator {
	
	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();
}
