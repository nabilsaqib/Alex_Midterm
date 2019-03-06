package design;



import java.util.Scanner;

public class EmployeeInfo {

	 private String name;
	 private int employeeId;
	 private String deptName;
	 private static double salary;
	 private




	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	String[] comName = new String[30];
	String s;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		int[] intIDs = new int[11];
		int n;

	}
    public EmployeeInfo(String name, int employeeId){
		String[] empName = new String[30];
		String s;
		}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
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
		System.out.println(" May,2012): ");
		String joiningDate = sc.nextLine();
		System.out.println("August,2018): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension



		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split("may 2015, june 2016");
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
