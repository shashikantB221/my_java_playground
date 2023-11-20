import java.util.ArrayList;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }



    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot deposit a negative amount.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot withdraw a negative amount.");
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void transfer(int fromAccount, int toAccount, double amount)
            throws AccountNotFoundException, NegativeAmountException {
        Account source = null;
        Account destination = null;

        for (Account acc : accounts) {
            if (acc.getAccountNumber() == fromAccount) {
                source = acc;
            } else if (acc.getAccountNumber() == toAccount) {
                destination = acc;
            }
        }

        if (source == null || destination == null) {
            throw new AccountNotFoundException("One or both accounts not found.");
        }

        source.withdraw(amount);
        destination.deposit(amount);
    }

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	
}

public class Solution {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1, "John", 1000);
        Account account2 = new Account(2, "Alice", 1500);

        bank.addAccount(account1);
        bank.addAccount(account2);

        try {
            bank.transfer(1, 2, 500);
        } catch (AccountNotFoundException | NegativeAmountException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        for (Account acc : bank.getAccounts()) {
            System.out.println("Account " + acc.getAccountNumber() + ": " + acc.getBalance());
        }
    }
}