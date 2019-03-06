package design;

import java.util.Scanner;

public class EmployeeInfo   {

	private String name;
	private int employeeId;
	private String deptName;
	private static double salary;
	private char gender;


	public EmployeeInfo () {}

	public EmployeeInfo(String name, int employeeId, String deptName, char gender, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.deptName = deptName;
		this.gender = gender;
		this.salary=salary;
	}

	static String companyName;

	public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;

	}
	public EmployeeInfo(String name, int employeeId){
		this.name=name;
		this.employeeId=employeeId;

	}

	public EmployeeInfo(String name, int employeeId, String deptName, double salary, char gender) {
		this.name = name;
		this.employeeId = employeeId;
		this.deptName = deptName;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public int employeeId() {
		return 0;
	}


	public String employeeName() {
		return null;
	}

	public void assignDepartment() {
		this.deptName=deptName;
	}

	public int calculateSalary() {
		return 0;
	}
	public void benefitLayout() {

	}
	public String getDept(String dept) {
		return deptName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
	public void farewell (){

	}
	public void annualSalary () {
		double yearlySalary = salary*12;
		System.out.println(yearlySalary);
		calculateEmployeeBonus(15);
	}

	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total = 0;
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int salary = Integer.parseInt(st);
		double bonus =(10.0/100.0) * salary;
		System.out.println("Bonus: " +bonus);

		return total;

	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println(" May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension

		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = (int) (salary * .25);
		} else if (numberOfYears == 4) {
			total = (int) (salary * .20);
		} else if (numberOfYears == 3) {
			total = (int) (salary * .15);
		} else if (numberOfYears == 2) {
			total = (int) (salary * .10);
		} else if (numberOfYears == 1) {
			total = (int) (salary * .05);
		} else if (numberOfYears == 0) {
			total = 0;
		}
		System.out.println("Total pension: $" + total);


		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					System.out.println("work evaluation");
					date = 1;
					break;
				case February:
					System.out.println("performance review");
					date = 2;
					break;
				case March:
					System.out.println(" opp training");
					date = 3;
					break;
				case April:
					System.out.println("visit branch office");
					date = 4;
					break;
				case May:
					System.out.println("visit branch office 2");
					date = 5;
					break;
				case June:
					System.out.println("visit branch office 3");

					date = 6;
					break;
				case July:
					System.out.println("evaluation meeting");

					date = 1;
					break;
				case August:
					System.out.println("group discussion");

					date = 1;
					break;
				case September:
					System.out.println("Training about Programming");

					date = 1;
					break;
				case October:
					System.out.println("visit office 4");

					date = 1;
					break;
				case November:
					System.out.println("monthly report submission");

					date = 1;
					break;
				case December:
					System.out.println("visit local market");

					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
