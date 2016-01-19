
public class Azienda {
	String RagioneSociale;
	String piva;
	ContrattoLavoro[] stipendi;
	
	
	Azienda(String rSoc,String pi, ContrattoLavoro stipendi){
		RagioneSociale = rSoc;
		piva = pi;
	   //stipendi= ???;
	}
	
	public int sumStipendi(){
		int sum = 0;
		for(ContrattoLavoro d: stipendi){
			sum += d.getPagabase();
		}
		return sum;
	}
}

