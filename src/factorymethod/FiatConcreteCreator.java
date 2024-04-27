package factorymethod;

/* Implementa��o concreta do padr�o Factory Method 
 * para criar objetos `Car` da marca Fiat. Esta classe retorna um objeto `ConcreteProductPalio` 
 * quando o m�todo `factoryMethod()` � chamado.
 */

public class FiatConcreteCreator extends CarCreator{
	 
	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
