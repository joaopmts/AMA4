package Ex42;

public class Programa {
	public static void main(String [] args) {

		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
