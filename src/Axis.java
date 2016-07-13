
public class Axis extends Bank{
	double roi = 9;
	
	//override getRateOfInterest method
	public void getRateOfInterest(){
		System.out.println("inside Axis Bank");
		System.out.println("The rate of interest is " + roi + "%");
	}
}
