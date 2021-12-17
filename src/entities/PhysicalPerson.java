package entities;

public class PhysicalPerson extends Person {

	private Double healthExpenses;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	@Override
	public double totalTaxCollected() {
		// TODO Auto-generated method stub
		double tax = 0;
		if(super.getAnnualIncome() < 20000) {
			tax = (super.getAnnualIncome() * 15/100) - (healthExpenses * 50 /100);
		} else{
			tax = (super.getAnnualIncome() * 25/100) - (healthExpenses * 50 /100);
		}
		return tax;
	}
	
	public String toString() {
		return super.getName() + ": $ " +  String.format("%.2f",totalTaxCollected());
	}

}
