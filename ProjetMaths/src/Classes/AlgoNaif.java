package Classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author trist
 *
 */
public class AlgoNaif {
	final static List<BigInteger> primaryNumber = new ArrayList<BigInteger>();
	private HashMap<BigInteger,BigInteger> hm = new HashMap<BigInteger,BigInteger>();
	private String nameAlgo = "AlgoNaif";
	private int nbOperations = 0;

	public AlgoNaif() {
		initList();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDivisible(BigInteger n,BigInteger diviseur) {
		nbOperations ++ ;
		return n.mod(diviseur)== BigInteger.valueOf(0);
	}
	
	public boolean isPrime(BigInteger n) {
		nbOperations ++ ;
		return n.isProbablePrime(Integer.MAX_VALUE);
	}

	
	/*A SUPP
	 * public void factoristation2(BigInteger n) {
		initPrimaryNumber(n);
		System.out.println("===============[FACTORISATION algo Naif]==============="+"\nN = "+n);
		for (BigInteger bigInteger : primaryNumber) {
			BigInteger cpt = BigInteger.valueOf(0);
			while(isPrime(n)) {
				cpt = cpt.add(BigInteger.valueOf(1));
				hm.put(bigInteger, cpt);
				n = n.divide(bigInteger);
			}
		}
		
		if(n != BigInteger.valueOf(1) ) {
			hm.put(n, BigInteger.valueOf(1));
		}
		display Hashmap
		displayMat();
		System.out.println("Nombre d'opérations = " + nbOperations ) ;
		System.out.println("===============[FACTORISATION algo Naif]===============");
		
	}*/
	
	
	public void factoristation(BigInteger n) {
		System.out.println("===============[FACTORISATION algo Naif]==============="+"\nN = "+n);
		hm.clear();
		for (BigInteger bigInteger : primaryNumber) {
			BigInteger cpt = BigInteger.valueOf(0);
			while(isDivisible(n, bigInteger)) {
				cpt = cpt.add(BigInteger.valueOf(1));
				hm.put(bigInteger, cpt);
				n = n.divide(bigInteger);
			}
		}
		
		if(n != BigInteger.valueOf(1) ) {
			hm.put(n, BigInteger.valueOf(1));
		}
		/*display Hashmap*/
		displayMat();
		System.out.println("\nNombre d'opérations = " + nbOperations ) ;
		System.out.println("===============[FACTORISATION algo Naif]===============");
		
	}
	
	private void displayMat() {
		int cpt = 0;
		System.out.print("factorisation(N) = ");
		for (BigInteger key : hm.keySet()) {
			cpt++;
			if(cpt == hm.size()) {
				System.out.print(key+"^"+hm.get(key));
			}else {
				System.out.print(key+"^"+hm.get(key)+"*");
			}
		}
	}
	
	public void initPrimaryNumber(BigInteger n) {
		BigInteger square = n.sqrt();
		BigInteger number = BigInteger.valueOf(1);
		for(number= BigInteger.valueOf(1); (number.add(BigInteger.valueOf(1))).compareTo(square) == -1 ; number.add(BigInteger.valueOf(1))) {
			
			
			if (number.isProbablePrime(Integer.MAX_VALUE)) {
				primaryNumber.add(number);
			}
		}
	}
	
	private void initList() {
		primaryNumber.add(BigInteger.valueOf(2));
		primaryNumber.add(BigInteger.valueOf(3));
		primaryNumber.add(BigInteger.valueOf(5));
		primaryNumber.add(BigInteger.valueOf(7));
		primaryNumber.add(BigInteger.valueOf(11));
		primaryNumber.add(BigInteger.valueOf(13));
		primaryNumber.add(BigInteger.valueOf(17));
		primaryNumber.add(BigInteger.valueOf(19));
		primaryNumber.add(BigInteger.valueOf(23));
		primaryNumber.add(BigInteger.valueOf(29));
		primaryNumber.add(BigInteger.valueOf(31));
		primaryNumber.add(BigInteger.valueOf(37));
		primaryNumber.add(BigInteger.valueOf(41));
		primaryNumber.add(BigInteger.valueOf(43));
		primaryNumber.add(BigInteger.valueOf(47));
		primaryNumber.add(BigInteger.valueOf(53));
		primaryNumber.add(BigInteger.valueOf(59));
		primaryNumber.add(BigInteger.valueOf(61));
		primaryNumber.add(BigInteger.valueOf(71));
		primaryNumber.add(BigInteger.valueOf(73));
		primaryNumber.add(BigInteger.valueOf(79));
		primaryNumber.add(BigInteger.valueOf(83));
		primaryNumber.add(BigInteger.valueOf(89));
		primaryNumber.add(BigInteger.valueOf(97));
	}

	@Override
	public String toString() {
		return "AlgoNaif : "+primaryNumber.toString();
	}
	
}
