package EmployeeManagementSystem;


	import java.util.Arrays;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Employee[] employees = new Employee[0];
	        Employee foundEmp;
	        String searchKey;

	        employees = ArrayUtils.add(employees, new Employee("Nandhana", "Full Stack Developer", 60000));
	        employees = ArrayUtils.add(employees, new Employee("Nandha", "Senior Developer", 160000));
	        employees = ArrayUtils.add(employees, new Employee("Kalai", "Intern", 10010.30));

	        System.out.println("\nInitial Data");
	        System.out.println(Arrays.toString(employees));

	        Scanner sc = new Scanner(System.in);

	        System.out.print("\nEnter Employee Name or ID: ");
	        searchKey = sc.nextLine();

	        foundEmp = ArrayUtils.search(employees, searchKey);

	        if(foundEmp != null){
	            System.out.println(foundEmp);
	        } else {
	            System.out.println("404! Employee Not Found!");
	        }

	        System.out.print("\nEnter Employee ID to Delete: ");
	        searchKey = sc.nextLine();

	        employees = ArrayUtils.delete(employees, searchKey);

	        sc.close();

	        System.out.println("\nEmployee Deletion Success!");
	        System.out.println(Arrays.toString(employees));
	    }
	}

