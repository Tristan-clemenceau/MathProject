package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trist
 *
 */
public class AlgoNaif {
	final static List<Integer> primaryNumber = new ArrayList<Integer>();

	public AlgoNaif() {
		initList();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDivisible(int n,int primaryNb) {
		return true;
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
