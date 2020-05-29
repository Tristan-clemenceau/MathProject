package Classes;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;

class AlgoRhoPollard {

	private final static BigInteger ZERO = new BigInteger("0");
	private final static BigInteger ONE = new BigInteger("1");
	private final static BigInteger TWO = new BigInteger("2");
	private final static SecureRandom random = new SecureRandom();
	private HashMap<BigInteger,BigInteger> hm = new HashMap<BigInteger,BigInteger>();
	private long nbOperation;
	private String nameAlgo = "AlgoRhoPollard";
	BigInteger cpt = BigInteger.valueOf(0);

	public AlgoRhoPollard() {
		nbOperation = 0;
	}

	public static BigInteger rho(BigInteger n) {

		BigInteger divisor;
		BigInteger c = new BigInteger(n.bitLength(), random);
		BigInteger x = new BigInteger(n.bitLength(), random);
		BigInteger xx = x;

		// check divisibility by 2
		if (n.mod(TWO).compareTo(ZERO) == 0)
			return TWO;

		do {

			x = x.multiply(x).mod(n).add(c).mod(n);
			xx = xx.multiply(xx).mod(n).add(c).mod(n);
			xx = xx.multiply(xx).mod(n).add(c).mod(n);
			divisor = x.subtract(xx).gcd(n);

		}

		while ((divisor.compareTo(ONE)) == 0);

		return divisor;
	}

	public void factor(BigInteger n) {
		this.nbOperation++;
		if (n.compareTo(ONE) == 0) {
			return;
		}

		if (n.isProbablePrime(20)) {
			System.out.println(n);
			hm.put(cpt,n);
			cpt = cpt.add(BigInteger.valueOf(1));
			return;
		}

		BigInteger divisor = rho(n);
		factor(divisor);
		factor(n.divide(divisor));
		/*DISPLAY HASMAP*/
	}
	

	public HashMap<BigInteger, BigInteger> getHm() {
		return hm;
	}

	public void setHm(HashMap<BigInteger, BigInteger> hm) {
		this.hm = hm;
	}

	public long getNbOperation() {
		return nbOperation;
	}

	public void setNbOperation(long nbOperation) {
		this.nbOperation = nbOperation;
	}

	public String getNameAlgo() {
		return nameAlgo;
	}

}