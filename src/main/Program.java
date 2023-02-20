package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

		System.out.print("Enter department's name: ");
		String departmentName = in.nextLine();
		System.out.println("Enter the worker data:");
		System.out.print("Name: ");
		String workerName = in.nextLine();
		System.out.print("Level: ");
		String workerLevel = in.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = in.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("\nHow many contracts to this worker? ");
		Integer n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter the contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(in.next());
			System.out.print("Value per hour: ");
			Double valuePerHourContract = in.nextDouble();
			System.out.print("Duration (hours): ");
			Integer durationHourContract = in.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHourContract, durationHourContract);
			worker.addContract(contract);
		}

		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = in.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		in.close();
	}
}
