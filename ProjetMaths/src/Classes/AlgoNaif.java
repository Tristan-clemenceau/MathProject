package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author trist
 *
 */
public class AlgoNaif {
	final static List<Integer> primaryNumber = new ArrayList<Integer>();
	private HashMap<Long,Long> hm = new HashMap<Long,Long>();

	public AlgoNaif() {
		initList();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDivisible(long n,long diviseur) {
		return (n%diviseur)==0;
	}
	
	public void factoristation(long n) {
		System.out.println("===============[FACTORISATION algo Naif]==============="+"\nN = "+n);
		for (Integer integer : primaryNumber) {
			long cpt = 0;
			while(isDivisible(n, integer)) {
				cpt++;
				hm.put((long)integer, cpt);
				n = n/integer;
			}
		}
		
		if(n != 1) {
			hm.put(n, (long)1);
		}
		/*display Hasmap*/
		displayMat();
		
	}
	
	private void displayMat() {
		int cpt = 0;
		System.out.print("factorisation(N) = ");
		for (Long key : hm.keySet()) {
			cpt++;
			if(cpt == hm.size()) {
				System.out.print(key+"^"+hm.get(key));
			}else {
				System.out.print(key+"^"+hm.get(key)+"*");
			}
		}
	}
	
	private void initList() {
		primaryNumber.add(2);
		primaryNumber.add(3);
		primaryNumber.add(5);
		primaryNumber.add(7);
		primaryNumber.add(11);
		primaryNumber.add(13);
		primaryNumber.add(17);
		primaryNumber.add(19);
		primaryNumber.add(23);
		primaryNumber.add(29);
		primaryNumber.add(31);
		primaryNumber.add(37);
		primaryNumber.add(41);
		primaryNumber.add(43);
		primaryNumber.add(47);
		primaryNumber.add(53);
		primaryNumber.add(59);
		primaryNumber.add(61);
		primaryNumber.add(71);
		primaryNumber.add(73);
		primaryNumber.add(79);
		primaryNumber.add(83);
		primaryNumber.add(89);
		primaryNumber.add(97);
	}

	@Override
	public String toString() {
		return "AlgoNaif : "+primaryNumber.toString();
	}
	
}
