package Ex71;

public class Maiusculo extends LerStringConsole {

	@Override
	protected void formatarTexto(String string) {
		
		System.out.println("Maiusculo: " + string.toUpperCase());

	}

}
