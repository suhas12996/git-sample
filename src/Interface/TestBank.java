package Interface;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCbank hs=new HSBCbank();
		hs.educationloan();
		hs.bikeLoan();
		hs.carLoan();
		hs.houseLoan();
		hs.personalLoan();
		hs.MutualFund();
		hs.Sharemarket();
		

		
	/*	UKBank uk=new HSBCbank(); //we can call the UKbank class method by this way also
		uk.educationloan();
		uk.carLoan();
		uk.bikeLoan();*/
	}
}
