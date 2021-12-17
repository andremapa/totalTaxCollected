package entities;

public class LegalPerson extends Person {

	private Integer employeeNumber;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	@Override
	public double totalTaxCollected() {
		// TODO Auto-generated method stub
		double tax = 0;
		if(employeeNumber < 10) {
			tax = (super.getAnnualIncome() * 16/100);
		} else{
			tax = (super.getAnnualIncome() * 14/100);
		}
		return tax;
	}
	
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f",totalTaxCollected());
	}
}
