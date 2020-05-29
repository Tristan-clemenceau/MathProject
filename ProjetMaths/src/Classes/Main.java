package Classes;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		/////// ALGO RHO DE POLLARD //////
		String input1 = ""+Long.MAX_VALUE+""+Long.MAX_VALUE+""+Long.MAX_VALUE+""+Long.MAX_VALUE+""+Long.MAX_VALUE;

		BigInteger N = new BigInteger(input1);
		//AlgoRhoPollard algo2 = new AlgoRhoPollard();
		Test test01 = new Test();

		//algo2.factor(N);
		/*for (long i = 2; i < Long.MAX_VALUE; i++) {
			BigInteger inpTT = new BigInteger(Long.toString(i));
			test01.factoristation(inpTT);
		}*/
		AlgoRhoPollard algo2 = new AlgoRhoPollard();
		System.out.println("===============[FACTORISATION algo rho de Pollard]===============\"");
		System.out.println("N =" +" "+ N + "" );
		System.out.println("Factorisation de N :");
		algo2.factor(N);
		
		/*AlgoNaif algo = new AlgoNaif();
        String s = "10" ;
        BigInteger bI = new BigInteger(s) ;
        algo.factoristation2(bI);*/
		
		/////// ALGO NAIF //////
		/*long n = 1548974564L;
		
		AlgoNaif algo1 = new AlgoNaif();
		PmoinsUnPollard pm = new PmoinsUnPollard();
		
		algo1.factoristation(n);
		pm.factoristation(n);*/

	}

}
