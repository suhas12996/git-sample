package Interface;

public class HSBCbank implements UKBank, BrazilBank { // this is called Mutliple inteface 

	public void educationloan() {
		System.out.println("Education loan 1k");
		
	}

	public void carLoan() {
		System.out.println("Carloan loan 2k");
		
	}

	public void bikeLoan() {
		System.out.println("bike loan 3k");
		
	}
	
	public void houseLoan() {
		System.out.println("house loan is 1Lac");
	}
	
	public void personalLoan() {
		System.out.println("personal loan is 2Lac");
	}


	public void MutualFund() {
		System.out.println("Mutual Investment is 1cr");
		
	}


	public void Sharemarket() {
		System.out.println("Share market investment is 100Cr");
		
	}
	
}