public class ActiveState implements AccountState {
    public void activate(Account account) {
        System.out.println("\nAccount is already activated! ");
    }

    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.print("Account is suspended! ");
    }

    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("\nAmount will be deposited:$" + depositAmount + account.toString());
    }

    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("\nAmount will be withdrawn:$" + withdrawAmount  + account.toString());
    }

    public void close(Account account) {
        System.out.println("\nAccount is Closed!" + account.toString());
        account.setAccountState(new ClosedState());
    }
}
