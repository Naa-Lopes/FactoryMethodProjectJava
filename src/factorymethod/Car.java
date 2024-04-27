package factorymethod;

/* Esta classe abstrata serve como base para todos os modelos concretos de carros
 * no padrão Factory Method. Ele define os atributos e comportamentos comuns compartilhados por todos os tipos de carros.
 * Subclasses concretas herdam de `Car` e implementam a lógica específica para cada modelo de carro.*/

public abstract class Car {
	private String model;
	private String factory;
	private String category;
	
	public void showInformation() {
		System.out.println("Model: " + this.getModel() + "\nFactory: " + this.getFactory() + "\nCategory: " + this.getCategory());
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
 
	public String getFactory() {
		return factory;
	}
 
	public void setFactory(String factory) {
		this.factory = factory;
	}
 
	public String getCategory() {
		return category;
	}
 
	public void setCategory(String category) {
		this.category = category;
	}
}