package Classes;

public class PmoinsUnPollard {
	private long a;
	private long i;
	private long d;
	private long temp;

	public PmoinsUnPollard() {
		a = 2;
		i = 2;
		d = 0;
		temp = 0;
	}

	public void factoristation(long n) {
		System.out.println("===============[FACTORISATION algo p-1 Pollard]==============="+"\nN = "+n);
		/*while(true) {
			a = sqrt(n);
		}*/
		System.out.println("\n===============[FACTORISATION algo p-1 Pollard]===============");
	}

	private int pgcd(int a, int b) {
		int t, r;
		if (b > a) {
			t = a;
			a = b;
			b = t;
		}
		do {
			r = a % b;
			a = b;
			b = r;
		} while (r != 0);
		return a;
	}
	
	private long sqrt(long n , long i) {
		//rajouter cond pour verifier taille du res < MAX.long.length
		long res =n;
		for(long t = 1;t<=i;t++) {
			res*= n;
		}
		return res;
	}
}
