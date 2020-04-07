package Ex71;

public abstract class LerStringConsole {
	
	public final void console(String string) {
		formatarTexto(string);
	}
	
	protected abstract void formatarTexto(String string);
}
