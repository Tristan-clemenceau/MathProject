package Classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 53628957L;
		
		AlgoNaif algo1 = new AlgoNaif();
		PmoinsUnPollard pm = new PmoinsUnPollard();
		
		algo1.factoristation(n);
		pm.factoristation(1);

	}

}
