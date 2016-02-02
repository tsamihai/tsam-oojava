package tudose.mihai.harbour;

public class Aereo  extends Invasore{
	private int alfa;
	private int beta;
	@Override
	void setpf() {
		setPf(alfa*10 + beta*25);
	}
}

