
public class Sbi extends Bank {
	double roi = 8;
	
	//override getRateOfInterest method
	public void getRateOfInterest(){
		System.out.println("inside SBI Bank");
		System.out.println("The rate of interest is " + roi + "%");
	}
}
