package factorymethod;

/* Implementa��o concreta do padr�o Factory Method 
 * para criar objetos `Car` da marca Volkswagen. Esta classe retorna um objeto `ConcreteProductGol` 
 * quando o m�todo `factoryMethod()` � chamado.
 */

public class VolksConcreteCreator extends CarCreator{

	protected Car factoryMethod(){
		return new ConcreteProductGol();
	}
	
}
