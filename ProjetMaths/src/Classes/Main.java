package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		/* VAR OBJECT */
		AlgoRhoPollard algo2 = new AlgoRhoPollard();
		AlgoNaif algo1 = new AlgoNaif();
		Test test01 = new Test();

		try (FileWriter fw = new FileWriter("test.csv", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			
			// BOUCLE ALGO
			for (long i = 2; i < 100000; i++) {// VAR A METTRE 100 , Long.MAX_VALUE
				String valResult =Long.toString(i)+",";
				BigInteger inpTT = new BigInteger(Long.toString(i));

				/* ALGO */
				algo1.factoristation(inpTT);
				valResult+=""+algo1.getNbOperations()+",";
				System.out.println(
						"===============[FACTORISATION algo AlgoRhoPollard]===============" + "\nN = " + inpTT.toString());
				algo2.factor(inpTT);
				valResult+=""+algo2.getNbOperation();
				System.out.println("Nombre d'opérations = " + algo2.getNbOperation());
				System.out.println("===============[FACTORISATION algo AlgoRhoPollard]===============");
				// test01.factoristation(inpTT);
				out.println(valResult);
			}
		} catch (IOException e) {
			System.out.println("Erreur : "+e.getMessage());
		}

	}

}
