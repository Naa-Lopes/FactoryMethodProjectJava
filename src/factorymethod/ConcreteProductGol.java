package factorymethod;

/* Implementação concreta de um carro da marca Volkswagen modelo Gol. 
* Esta classe define os atributos e funcionalidades específicos do carro Gol, 
* seguindo o padrão de criação de carros. */

public class ConcreteProductGol extends Car{

	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
