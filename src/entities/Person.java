package entities;

public abstract class Person {
	
	private String name;
	private Double annualIncome;
	
	public Person() {}

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public abstract double totalTaxCollected();
	
	public String getName() {
		return name;
	}
	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	
	
	
}
