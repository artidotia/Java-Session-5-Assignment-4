
public class BankInterestRate {

	public static void main(String[] args) {
		Bank bk = new Bank();
		Axis ax = new Axis();
		Sbi sb = new Sbi();
		Icici ic = new Icici();
		
		System.out.println();
		bk.getRateOfInterest();
		
		System.out.println();
		ax.getRateOfInterest();
		
		System.out.println();
		sb.getRateOfInterest();
		
		System.out.println();
		ic.getRateOfInterest();
	}

}
