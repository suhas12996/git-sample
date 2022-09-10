package abstractionConcept;

public abstract class Bank { //this is called partial absrtacion 

	public abstract void loan(); //abstraction method

	public void EducationalLoan() {
		System.out.println("Educational Loan");
	}
	
	public void CarLoan() {
		System.out.println("Car Loan");
	}
}
