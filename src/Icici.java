
public class Icici extends Bank {
	double roi = 7;
	
	
	//override getRateOfInterest method
	public void getRateOfInterest(){ 
		System.out.println("inside ICICI Bank");
		System.out.println("The rate of interest is " + roi + "%");
	}
}
