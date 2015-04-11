package teste.es.generic.event;

public class CreateRequestEvent <T>{

	private T object;

	public CreateRequestEvent(T object) {
		super();
		this.object = object;
	}

	public T getObject() {
		return object;
	}	

}
