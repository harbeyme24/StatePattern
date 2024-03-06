public class ClosedState implements AccountState {
    public void close(Account account) {
        System.out.println("Your Account is already Closed!\n\n");
    }

    public void activate(Account account) {
        System.out.println("You cannot activate a closed account! ");
    }

    public void suspend(Account account) {
        System.out.print("You cannot suspend a closed account! ");
    }

    public void deposit(Double depositAmount, Account account) {
        System.out.println("\nYou cannot deposit on a closed account!" + account.toString());
    }

    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("\nYou cannot withdraw on a closed account!" + account.toString());
    }
}
