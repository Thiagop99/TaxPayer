package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthCost = sc.nextDouble();
				list.add(new Individual(name, income, healthCost));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, income, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
		}
		sc.close();
		
		double sum = 0;
		for (TaxPayer tax : list ) {
			sum += tax.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
	}
}
