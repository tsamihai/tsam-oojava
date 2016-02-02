package tudose.mihai.harbour;

public class Sottomarino extends Invasore {
		private int armamenti;
		private int stazza;
		
		
		public int getArmamenti() {
			return armamenti;
		}


		public void setArmamenti(int armamenti) {
			this.armamenti = armamenti;
		}


		public int getStazza() {
			return stazza;
		}


		public void setStazza(int stazza) {
			this.stazza = stazza;
		}


		@Override
		public void setpf(){
			setPf(armamenti * stazza);
		}
		
		
}