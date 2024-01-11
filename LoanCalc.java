public class LoanCalc {
	
	static double epsilon = 0.001;  
	static int iterationCounter;    

	public static void main(String[] args) {		
		// Gets the loan data
		double loan = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);
		
		// Computes the periodical payment using brute force search
		System.out.print("Periodical payment, using brute force: ");
		System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);

		// Computes the periodical payment using bisection search
		System.out.print("Periodical payment, using bi-section search: ");
		System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);
	}
	
    public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {  

		iterationCounter = 0; 
    	double g = loan/n ;
		while (endBalance(loan,rate,n,g) >= epsilon){
			g += epsilon ;
			iterationCounter++ ;
		}
    	return g;
    }
    
    public static double bisectionSolver(double loan, double rate, int n, double epsilon) {  
    	
		iterationCounter = 0; 
		double L = 0 ;
		double H = loan ;
		double g = (L + H)/2 ;
		while ((H-L) >= epsilon){
			if ((endBalance(loan,rate,n,g))*(endBalance(loan,rate,n,H))  < 0 ){
				L = g ; 
			
			}else
			{
				H = g ;
			}
			g = (L + H)/2 ;
			iterationCounter++ ;
		
		}
			

    	return g;
    }
	
	private static double endBalance(double loan, double rate, int n, double payment) {

		double balance = 0 ;
		double currentBalance = loan ; 
		
		for(int i =1 ; i <= n ; i++){

			balance = (currentBalance - payment)*(1+(rate/100)) ;
			currentBalance = balance ; 
		}

    	return balance ;
	}
}
