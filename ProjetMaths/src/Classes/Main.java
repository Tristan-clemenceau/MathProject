package Classes;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		/////// ALGO RHO DE POLLARD //////
		String input1 = "654";
		BigInteger N = new BigInteger(input1);
		AlgoRhoPollard algo2 = new AlgoRhoPollard();

		algo2.factor(N);
		
		
		/////// ALGO NAIF //////
		
		long n = 53628957L;

		AlgoNaif algo1 = new AlgoNaif();
		algo1.factoristation(n);

	}

}
