package Ex61;

import java.util.Calendar;

public class MensagemDaSorte {
	
	public void mensagemDeHoje() {
		
		Calendar c = Calendar.getInstance();

		MensagemDoDia hoje = null;
		if(c.get(Calendar.DAY_OF_WEEK) == 1){
			
			hoje = new Domingo();
		}
		if(c.get(Calendar.DAY_OF_WEEK) == 2) {
			hoje = new SegundaFeira();
		}
		if(c.get(Calendar.DAY_OF_WEEK) == 3) {
			hoje = new TerçaFeira();
		}
		if(c.get(Calendar.DAY_OF_WEEK) == 4) {
			hoje = new QuartaFeira();
		}
		if(c.get(Calendar.DAY_OF_WEEK) == 5) {
			hoje = new QuintaFeira();
		}
		if(c.get(Calendar.DAY_OF_WEEK) == 6) {
			hoje = new SextaFeira();
		}
		if(c.get(Calendar.DAY_OF_WEEK) == 7) {
			hoje = new Sabado();
		}
		System.out.println(hoje.mensagemDeHoje());
	}

}
