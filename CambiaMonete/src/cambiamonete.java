


public class cambiamonete {
	
	/*Cambia Monete

		Dato un numero intero, rappresentante un valore in euro, indicare la combinazione di
		banconote da:
		500, 200, 100, 50, 20, 10, 5, 2, 1 euro
		che permettono di ottenere tale cifra.*/
	

	public static String cambiaMonete(int n){

	String banconote = " ";
		
		while(n>0){
				if( n >= 500){
					n = n - 500;
					banconote+="500$ ";
				}
				else if( n >= 200){
					n = n - 200;
					banconote+="200$";
				}
				else if( n >= 100){
					n = n - 100;
					banconote+="100$";
				}
				else if( n >= 50){
					n = n - 50;
					banconote+="50$";
				}
				else if( n >= 20){
					n = n - 20;
					banconote+="20$";
				}
				else if( n >= 10){
					n = n - 10;
					banconote+="10$";
				}
				else if( n >= 5){
					n = n - 5;
					banconote+="5$";
				}
				else if( n >= 2){
					n = n - 2;
					banconote+="2$";
				}
				else if( n >= 1){
					n = n - 1;
					banconote+="1$";
				}
				
				
		}
		return banconote;	
				
    }
	
	
	
	
	
	
	public static void main(String [] args){
		
		System.out.println(cambiaMonete(1878));
		
	}

}
