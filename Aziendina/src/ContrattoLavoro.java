
public class ContrattoLavoro {
	String tipo;
	int pagabase;
	
	
	ContrattoLavoro(String t, int pb){
		tipo = t;
		pagabase=pb;
		
	}
	public void setTipo(String tipo){
		this.tipo= tipo;
	}
	public void setPagabase(int pagabase){
		this.pagabase=pagabase;
	}
	public String getTipo(){
		return tipo;
	}
	public int getPagabase(){
		return pagabase;
	}
}
