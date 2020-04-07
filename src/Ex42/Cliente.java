package Ex42;

public class Cliente {
	private SomadorEsperado somador;

	public Cliente(SomadorEsperado somador) {
		this.somador =somador;
	}

	public void executar() {
		int[] vetor = new int[] {11,22,33,44,55,66,77,88,99,111};
		int soma =somador.somaVetor(vetor);
		System.out.println("Resultado: " +soma); 
	}
}
