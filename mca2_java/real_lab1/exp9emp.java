import java.util.Scanner;

class exp9Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Employee Salary: ");
            int eSalary = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n\n=============================");
            employees[i] = new Employee(eNo, eName, eSalary);
        }
	System.out.print("\nOptions \n1.Search\n2.Dispaly All\nEnter your choice :");
	int ch=scanner.nextInt();
	boolean found;
	switch(ch){

	case 1:
        System.out.print("Enter the employee number to search: ");
        int searchENo = scanner.nextInt();
        found = false;
        for (Employee emp : employees) {
            if (emp.eNo == searchENo) {
                emp.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with employee number " + searchENo + " not found.");
        }
	break;
	case 2:
        System.out.print("Employee data ");
	found = false;
	int i=1;
        for (Employee emp : employees) {
                System.out.println("\nEmployee "+i+"\n-----------");
		i=i+1;
                emp.display();
                found = true;
             }
        if (!found) {
            System.out.println("are empthy !!!");
        }
	}

        scanner.close();
    }
}
class Employee {
    int eNo;
    String eName;
    int eSalary;

    Employee(int eNo, String eName, int eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

 
