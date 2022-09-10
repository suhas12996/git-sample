package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub

	HDFCBank b=new HDFCBank();
	b.loan();
	
	Bank b1= new HDFCBank(); //dynamic polymorphism or top casting
	
	b1.CarLoan();
	b1.EducationalLoan();
	b1.loan();
	
}
	
}
