public class SuspendedState implements AccountState {
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("\nAccount is activated!");
    }

    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed! ");
    }

    public void suspend(Account account) {
        System.out.print("Account is already suspended! ");
    }

    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a suspended account!: " + depositAmount
                + account.toString() + "\n");
    }

    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a suspended account: " + withdrawAmount +
                account.toString() + "\n");
    }
}
