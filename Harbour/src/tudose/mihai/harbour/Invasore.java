package tudose.mihai.harbour;

public  abstract class Invasore {
	private String codiceIdentificativo;
	private String modello;
	private int pf;
	public String getCodiceIdentificativo() {
		return codiceIdentificativo;
	}
	public void setCodiceIdentificativo(String codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getpf() {
		return getPf();
	}
	public void setpf(int pf) {
		this.setPf(pf);
	}

	void setpf() {
		// TODO Auto-generated method stub
		
	}
	public double getMquadDistrutti(){
		return getPf()*1.5;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
}
