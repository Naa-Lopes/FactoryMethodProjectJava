package factorymethod;

/* Implementação concreta de um carro da marca Fiat modelo Palio. 
 * Esta classe define os atributos e funcionalidades específicos do carro Palio, 
 * seguindo o padrão de criação de carros. */

public class ConcreteProductPalio extends Car{
	
	public ConcreteProductPalio() {
		
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
		
	}
}
