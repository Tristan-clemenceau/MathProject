package Classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Test {
	private List<BigInteger> primaryWare;

	public Test() {
		primaryWare = new ArrayList<BigInteger>();
	}

	private void displayWare() {
		System.out.print("factorisation(N) = ");
		for (int a = 0; a < primaryWare.size() - 1; a++) {
			System.out.print(primaryWare.get(a) + " * ");
		}
		System.out.print(primaryWare.get(primaryWare.size() - 1));
	}

	public void factoristation(BigInteger n) {
		System.out.println("===============[FACTORISATION algo p-1 Pollard]===============" + "\nN = " + n);
		BigInteger d = new BigInteger("0");
		BigInteger r = new BigInteger("0");
		BigInteger tempValuNdivD = new BigInteger("0");
		while (true) {
			d = traitement(n);
			primaryWare.add(d);
			tempValuNdivD = n;
			r = tempValuNdivD.divide(d);
			System.out.println("d : "+d+" n : "+n+" r : "+r);
			if (r.isProbablePrime(Integer.MAX_VALUE)) {
				primaryWare.add(r);
				break;
			} else {
				n = r;
			}

		}
		displayWare();
		primaryWare.clear();
		System.out.println("\n===============[FACTORISATION algo p-1 Pollard]===============");
	}

	public BigInteger traitement(BigInteger n) {
		/* DEFINITION VARIABLE */
		BigInteger a = new BigInteger("2");
		BigInteger i = new BigInteger("2");
		BigInteger d = new BigInteger("0");
		BigInteger tempValuAmoins1 = new BigInteger("0");
		BigInteger borne = new BigInteger("4");
		BigInteger bornemin = new BigInteger("4");

		if (n.equals(borne)) {// n = 4
			return BigInteger.TWO;
		} else if (n.compareTo(bornemin) == -1) { // n<4
			return n;
		} else {// other
			while (true) {
				a = a.pow(i.intValue()).mod(n);
				// A-1
				tempValuAmoins1 = a;
				tempValuAmoins1 = tempValuAmoins1.subtract(BigInteger.ONE);

				// PGCD(a-1,n)
				d = tempValuAmoins1.gcd(n);
				// System.out.println(" A : "+a+" I : "+i+" N : "+n+" D : "+d);
				if (d.compareTo(BigInteger.ONE) == 1) {
					return d;
				} else {
					i = i.add(BigInteger.ONE);
					// System.out.println(" A : "+a+" I : "+i+" N : "+n+" D : "+d);
				}
			}
		}
	}

}
