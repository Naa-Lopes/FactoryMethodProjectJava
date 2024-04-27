package factorymethod;

/* Implementa��o concreta de um carro da marca Volkswagen modelo Gol. 
* Esta classe define os atributos e funcionalidades espec�ficos do carro Gol, 
* seguindo o padr�o de cria��o de carros. */

public class ConcreteProductGol extends Car{

	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
