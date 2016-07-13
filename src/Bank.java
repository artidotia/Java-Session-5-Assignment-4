
public class Bank {
	private double rateOfInterest;
	
	Bank(){
		rateOfInterest = 4;
	}
	
	Bank(double roi){
		rateOfInterest = roi;
	}
	
	public void getRateOfInterest(){
		System.out.println("inside Bank");
		System.out.println("The rate of interest is " + rateOfInterest + "%");
	}
}
