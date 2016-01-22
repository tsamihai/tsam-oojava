package tudose.mihai.alieni;

public class Gioco {
	Giocatore Giocatore;
	
	public boolean	GiocatoreVivo(){
		if (Giocatore.getLivellosalute()>0){
			return true;
		}else
			return false;
	}
	public int attaccoalieno(Alieno Alieno){
		if(GiocatoreVivo()){
			Giocatore.setLivellosalute(Giocatore.getLivellosalute() - Alieno.getDanno());
			return Giocatore.getLivellosalute(); 
		}
		else {
			return Giocatore.getLivellosalute();			
		}
	}	
}
