package Classes;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		/*VAR OBJECT*/
		AlgoRhoPollard algo2 = new AlgoRhoPollard();
		AlgoNaif algo1 = new AlgoNaif();
		Test test01 = new Test();

		//BOUCLE ALGO
		for (long i = 2; i < 101; i++) {//VAR A METTRE 100 , Long.MAX_VALUE
			BigInteger inpTT = new BigInteger(Long.toString(i));
			/*ALGO*/
			//test01.factoristation(inpTT);
			algo1.factoristation(inpTT);
			System.out.println("===============[FACTORISATION algo AlgoRhoPollard]==============="+"\nN = "+inpTT.toString());
			algo2.factor(inpTT);
			System.out.println("Nombre d'opérations = "+algo2.getNbOperation());
			System.out.println("===============[FACTORISATION algo AlgoRhoPollard]===============");
		}
		
		
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
