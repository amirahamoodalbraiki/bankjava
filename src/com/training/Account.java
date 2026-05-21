class Account {

    int accountNumber;

    String customerName;

    double balance;

    // Constructor

    Account(int accountNumber, String customerName, double balance) {

        this.accountNumber = accountNumber;

        this.customerName = customerName;

        this.balance = balance;

    }

    // Deposit Method

    void deposit(double amount) {

        balance += amount;

        System.out.println(amount + " deposited successfully.");

    }

    // Withdraw Method

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(amount + " withdrawn successfully.");

        } else {

            System.out.println("Insufficient Balance.");

        }

    }

    // Display Balance

    void displayBalance() {

        System.out.println("Account Number: " + accountNumber);

        System.out.println("Customer Name: " + customerName);

        System.out.println("Balance: " + balance);

    }

}