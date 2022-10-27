
public class BankAccount {
  String name; // e.g., "Spongebob Squarepants"
  int accountNumber;
  double balance;

  public BankAccount(String initialName, int initialAccountNumber, double initialBalance) {
    name = initialName;
    accountNumber = initialAccountNumber;
    balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  public void withdrawal(double amount) {
    if (balance <= amount) {
      balance -= amount;
    }
  }

  public boolean equals(BankAccount otherAccount) {
    return name.equals(otherAccount.name) && accountNumber == otherAccount.accountNumber;
  }

  // Add a toString() method to BankAccount.
  public String toString() {
    return "Name :" + name +
        "\nAccount Number: " + accountNumber +
        "\nbalance: " + balance;
  }
}