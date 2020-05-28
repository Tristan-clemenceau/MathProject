package Classes;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		/////// ALGO RHO DE POLLARD //////
		String input1 = "4946546455565";
		BigInteger N = new BigInteger(input1);
		AlgoRhoPollard algo2 = new AlgoRhoPollard();
		System.out.println("===============[FACTORISATION algo rho de Pollard]===============\"");
		System.out.println("N =" +" "+ N + "" );
		System.out.println("Factorisation de N :");
		algo2.factor(N);
		
		/////// ALGO NAIF //////
		
		long n = 53628957L;

		AlgoNaif algo1 = new AlgoNaif();
		PmoinsUnPollard pm = new PmoinsUnPollard();
		
		algo1.factoristation(n);
		pm.factoristation(n);

	}

}
