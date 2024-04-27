package factorymethod;

/* Implementação concreta do padrão Factory Method 
 * para criar objetos `Car` da marca Volkswagen. Esta classe retorna um objeto `ConcreteProductGol` 
 * quando o método `factoryMethod()` é chamado.
 */

public class VolksConcreteCreator extends CarCreator{

	protected Car factoryMethod(){
		return new ConcreteProductGol();
	}
	
}
