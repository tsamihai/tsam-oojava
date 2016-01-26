package tudose.mihai.videoteca;

public class Film {
	private String titolo;
	private String nomeRegistra;
	private int annoProduzione;
	private String[]  attoriPrincipali;
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegistra() {
		return nomeRegistra;
	}
	public void setNomeRegistra(String nomeRegistra) {
		this.nomeRegistra = nomeRegistra;
	}
	public int getAnnoProduzione() {
		return annoProduzione;
	}
	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	public String[] getAttoriPrincipali() {
		return attoriPrincipali;
	}
	public void setAttoriPrincipali(String[] attoriPrincipali) {
		this.attoriPrincipali = attoriPrincipali;
	}
	

}
