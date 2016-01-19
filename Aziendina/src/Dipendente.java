
public class Dipendente {
	String nome;
	String cognome;
	ContrattoLavoro contratto;
	
	Dipendente(){
		
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	public void setStipendio(ContrattoLavoro stipendio){
		this.contratto=stipendio;
	}
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	
	public  int getStipendio(){
		return this.contratto.getPagabase();
	}
}

