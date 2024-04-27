package factorymethod;

/* Implementação concreta do padrão Factory Method 
 * para criar objetos `Car` da marca Fiat. Esta classe retorna um objeto `ConcreteProductPalio` 
 * quando o método `factoryMethod()` é chamado.
 */

public class FiatConcreteCreator extends CarCreator{
	 
	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
