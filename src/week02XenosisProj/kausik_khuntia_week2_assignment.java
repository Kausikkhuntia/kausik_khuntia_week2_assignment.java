package week02XenosisProj;
import java.util.Scanner;  
	

	class Person {
	    private String name;
	    private int age;

	    // Constructor for Person class
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display person's name
	    public void displayName() {
	        System.out.println("Name: " + this.name);
	    }

	    // Method to display person's age
	    public void displayAge() {
	        System.out.println("Age: " + this.age);
	    }
	}

	class BankAccount {
	    private double balance;

	    // Constructor for BankAccount class
	    public BankAccount(double initialBalance) {
	        if (initialBalance > 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	        }
	    }

	    // Method for depositing money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            this.balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method for withdrawing money
	    public void withdraw(double amount) {
	        if (amount > 0 && this.balance >= amount) {
	            this.balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid or insufficient funds for withdrawal.");
	        }
	    }

	    // Method to display current balance
	    public void displayBalance() {
	        System.out.println("Current Balance: " + this.balance);
	    }
	}

	public class kausik_khuntia_week2_assignment {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

	        // Input for Person class
	        System.out.print("Enter the name of the person: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter the age of the person: ");
	        int age = scanner.nextInt();

	        // Create an instance of Person with user input
	        Person person = new Person(name, age);
	        person.displayName();
	        person.displayAge();

	        // Input for BankAccount class
	        System.out.print("Enter the initial balance for the bank account: ");
	        double initialBalance = scanner.nextDouble();
	        BankAccount account = new BankAccount(initialBalance);
	        account.displayBalance();

	        // Perform deposit
	        System.out.print("Enter amount to deposit: ");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        // Perform withdrawal
	        System.out.print("Enter amount to withdraw: ");
	        double withdrawalAmount = scanner.nextDouble();
	        account.withdraw(withdrawalAmount);

	       
	        account.displayBalance(); 
	    }
	}



