# StatePattern

# 1. Problem Scenario
A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.
Active accounts: Allow deposits and withdrawals.
Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information.
Closed accounts: Disallow all transactions and viewing of account information.
Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.
Implement the State pattern to improve code maintainability and flexibility:
Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.
Update Account Class:
Include attributes for accountNumber and balance.
Remove state-specific logic from the Account class.
Introduce a reference to the current AccountState object.
Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.
 
Logic:

If the account is active
    You can either suspend it or close it.
If the account is suspended
    You can either activate or close it.
     No deposits and withdrawals allowed.
If the account is closed
     You can neither suspend nor activate it.
      No deposits and withdrawals allowed.


Composition of Account:
attributes:
accountNumber : String
balance:  Double
accountState:  AccountState

Methods:
Setter and getter methods
deposit(Double depositAmount): void
withdraw(Double withdrawAmount): void
suspend(): void
activate(): void
close() : void
toString()   // displays account number and balance

Note:  No if-else, switch will be used

Create AccountTest() class to test the Account:

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate(); // displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); // displays "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0); // updates balance and displays account number and current balance

        // Withdraw from the account
        myAccount.withdraw(100.0); // updates balance and displays account number and current balance

        // Close the account
        myAccount.close(); // displays "Account is closed!"

        // Activate the account
        myAccount.activate(); // displays "You cannot activate a closed account!"

        // Suspend the account
        myAccount.suspend(); // displays "You cannot suspend a closed account!"

        // Withdraw from the account
        myAccount.withdraw(500.0); // shows message "You cannot withdraw on a closed account!"
                                   // Call the toString() to show current balance and account number.

        // Deposit to the account
        myAccount.deposit(1000.0); // shows message "You cannot deposit on a closed account!"
                                   // Call the toString() to show current balance and account number.
    }
}


# 2. UML Diagram
<img width="1463" alt="Screenshot 2024-03-07 at 12 42 55 AM" src="https://github.com/harbeyme24/StatePattern/assets/143273418/5aed7214-220d-43a8-80db-4164bab82246">


# 3. Java Source Codes Solution

<img width="2560" alt="Screenshot 2024-03-07 at 12 19 18 AM" src="https://github.com/harbeyme24/StatePattern/assets/143273418/c88d1000-885f-4004-af32-1452dd21e5b3">

}
