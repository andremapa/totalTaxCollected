package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> person = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int quantity = sc.nextInt();
		
		for(int i=0; i< quantity; i++) {
			sc.nextLine();
			System.out.print("Individual or company (i/c)? ");
			String type = sc.nextLine();
			
			if(type.equals("i")) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Annual Income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				person.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Annual Income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int emplouyeeNumber = sc.nextInt();
				
				person.add(new LegalPerson(name, annualIncome, emplouyeeNumber));
			}
		}
		
		System.out.println("\nTAXES PAID: ");
		for (Person person2 : person) {
			System.out.println(person2.toString());
		}
		
		double sum = 0;
		for (Person person3 : person) {
			 sum += person3.totalTaxCollected();
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

} 
