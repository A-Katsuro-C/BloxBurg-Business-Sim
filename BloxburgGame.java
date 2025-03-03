import java.util.Scanner;

public class BloxburgGame {
    public static void main(String[] args) {
        //Scanner + Variables 
        Scanner input = new Scanner(System.in);
        String busName;
        String ownerName;
        double startFunds = 5000.0;
        String empName;
        String role;
        double salary;
        
        //Title
        System.out.println("Welcome to Bloxburg Business Simulator!");
        
        
        //Asking and inputing the Business, and Owner Name
        System.out.println("\nWhat would you like to name your starter business?");
        busName = input.nextLine();
        System.out.println("What is the owners name?");
        ownerName = input.nextLine();
        
        //Asking and inputing info about Employees
        System.out.println("\nWhat is the name of your first Employee? ");
        empName = input.nextLine();
        System.out.println("What is the role of: " + empName + "? ");
        role = input.nextLine();
        System.out.println("How much is " + empName + " making an hour?");
        salary = input.nextDouble();
        input.nextLine();
        input.close();
        
        //Allows input for first Business and first Employee
        Business starterPlace = new Business(busName, ownerName, startFunds);
        starterPlace.setTaxes();
        Business.Employee startEmp = starterPlace.new Employee(empName, role, salary);
        
        //Bar Business
        Business bar = new Business("The Whiskey Sour", 2000);
        Business.Employee barEmp = bar.new Employee("Michael", "Bartender", 10.50);
        Business.Employee barEmp2 = bar.new Employee("Jerry");
        
        //Upcoming Business
        Business upcomingBus = new Business("The Leaning Tower of Pizza");
        
        
        //Header Output
        System.out.println("----------------------------");
        System.out.println("\nTotal businesses created: " + upcomingBus.getTotalBus());
        
        //Prints info for Starter Business
        System.out.println("\nBusiness: " + starterPlace.getBusName());
        System.out.println("Owner: " + starterPlace.getOwnerName());
        System.out.println("\nFunds before taxes: $" + startFunds);
        System.out.println("Funds after taxes: $" + starterPlace.getTaxes());
        System.out.println("Employee: " + startEmp.getEmpName() + "| Role: " + startEmp.getRole() + " | Salary: $" + startEmp.getSalary() + "/hour ");
        
        System.out.println();
        
        //Prints info for Bar Business
        System.out.println("\nBusiness: " + bar.getBusName());
        System.out.println("\nFunds before taxes: $" + bar.currentFunds());
        bar.setTaxes();
        System.out.println("Funds after taxes: $" + bar.getTaxes());
        System.out.println("Employee: " + barEmp.getEmpName() + "| Role: " + barEmp.getRole() + " | Salary: $" + barEmp.getSalary() + "/hour ");
        System.out.println("Employee: " + barEmp2.getEmpName() + "| Role: Fired" + barEmp2.getRole() + " | Salary: $" + barEmp2.getSalary() + "/hour ");
        
        //Prints Upcoming Business Info
        System.out.println("\nBusiness: " + upcomingBus.getBusName());
        System.out.println("\nWe are creating a new resturant called: " + upcomingBus.getBusName());
        System.out.println("Be sure to come by once open!");
    }
}

