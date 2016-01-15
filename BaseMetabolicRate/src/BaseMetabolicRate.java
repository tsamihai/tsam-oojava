
public class BaseMetabolicRate{


		public static double BaseMetabolicRateMan(double peso,double altezza, int eta,String attivitafatta,String sesso){
			
			double metabolismouomo= 0;
		    
			if(sesso =="m"){
				
			metabolismouomo =  655+(((13.8*peso)+ (1.8*altezza))*(4.7*eta));
			
			}
			
			
			return metabolismouomo;
		}
		public static double BaseMetabolicRateWomen(double peso,double altezza, int eta,String attivitafatta,String sesso){
			
			
		    double metabolismodonna= 0;
			if(sesso =="f"){
				
			
				metabolismodonna = 655+(((9.6*peso)+ (1.8*altezza))*(4.7*eta));
				
			}
			
			
			
			return metabolismodonna;
		}

		


		public static void main(String [] args){
			System.out.println(BaseMetabolicRateMan(90,190, 19, "sedentario", "m"));
			
			
		}
}