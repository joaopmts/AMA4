package Ex72;

public class VetorDouble extends Number implements Comparable<VetorDouble> {

	private static final long serialVersionUID = 1L;
	private Double vetor;
	public VetorDouble(Double vetor) {
		this.vetor = vetor;
	}
	
	@Override
	public int intValue() {
		return vetor.intValue();
	}

	@Override
	public long longValue() {
		return 0;
	}

	@Override
	public float floatValue() {	
		return 0;
	}

	@Override
	public double doubleValue() {
		return vetor.doubleValue();
	}
	
	@Override
	public int compareTo(VetorDouble entrada) {
		double decimais = vetor - vetor.intValue();
		double entradadecimais = entrada.doubleValue() - entrada.intValue();
		if(decimais < entradadecimais) {
			return -1;
		}
		else if(decimais == entradadecimais) {
			return 0;
		}
		else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "" + vetor;
	}

}
