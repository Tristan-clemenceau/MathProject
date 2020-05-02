package Classes;

import java.util.ArrayList;
import java.util.List;

public class PmoinsUnPollard {
	final static List<Integer> primaryNumber = new ArrayList<Integer>();
	private List<Long> primaryWare;

	public PmoinsUnPollard() {
		primaryWare = new ArrayList<Long>();
	}
	
	private void displayWare() {
		System.out.print("factorisation(N) = ");
		for (int a = 0; a<primaryWare.size()-1;a++) {
			System.out.print(primaryWare.get(a)+" * ");
		}
		System.out.print(primaryWare.get(primaryWare.size()-1));
	}

	public void factoristation(long n) {
		System.out.println("===============[FACTORISATION algo p-1 Pollard]===============" + "\nN = " + n);
		long r, d;
		while (true) {
			d = task(n);
			primaryWare.add(d);
			r = (long) n / d;
			if (isPrimary(r)) {
				primaryWare.add(r);
				break;
			} else {
				n = r;
			}
		}
		displayWare();
		System.out.println("\n===============[FACTORISATION algo p-1 Pollard]===============");
	}

	private long task(long n) {
		long a = 2, i = 2,d=0;
		while (true) {
			a = sqrt(a, i) % n;
			d = pgcd((a - 1), n);
			if (d > 1) {
				return d;
			} else {
				i += 1;
			}
		}
	}

	private long pgcd(long a, long b) {
		long t, r;
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

	private long sqrt(long n, long i) {
		// rajouter cond pour verifier taille du res < MAX.long.length
		long res = n;
		for (long t = 1; t <= i; t++) {
			res *= n;
		}
		return res;
	}

	private boolean isPrimary(long n) {
		boolean ok = true;
		for(long t = 2;t<(n/2);t++) {
			if(n % t == 0) {
				ok = false;
				break;
			}
		}
		return ok;
	}
}
