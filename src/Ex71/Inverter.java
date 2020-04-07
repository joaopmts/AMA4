package Ex71;

public class Inverter extends LerStringConsole {
	public String inverte;
	
	@Override
	protected void formatarTexto(String string) {
		
		int len = string.length();
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];
		
		for(int i=0 ; i < len ; i++) {
			tempCharArray[i] = string.charAt(i);
		}
		
		for(int i = 0 ; i <len ; i++) {
			charArray[i] = tempCharArray[len - 1 - i];
		}
		
		inverte = new String(charArray);
		System.out.println("Inversa: " + inverte);
	}
}
