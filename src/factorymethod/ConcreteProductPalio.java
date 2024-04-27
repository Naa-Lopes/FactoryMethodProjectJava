package factorymethod;

/* Implementa��o concreta de um carro da marca Fiat modelo Palio. 
 * Esta classe define os atributos e funcionalidades espec�ficos do carro Palio, 
 * seguindo o padr�o de cria��o de carros. */

public class ConcreteProductPalio extends Car{
	
	public ConcreteProductPalio() {
		
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
		
	}
}
