import java.util.*;

public class Account {
    private String name;
    private int id;
    private int accountPin;
    private double balance;
    private boolean inDebt;

    public Account(String name, int id, int accountPin, double balance) {
        this.name = name;
        this.id = id;
        this.accountPin = accountPin;
        this.balance = balance;
        inDebt = (balance < 0) ? true : false;

    }

    public void deposit(double amnt) {
        if (amnt < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }

        balance += amnt;
        inDebt = (balance < 0);
    }

    public void withdraw(double amnt) {
        if (amnt < 0) {
            throw new IllegalArgumentException("Cannot withdraw2 negative amount");
        }

        if (!inDebt) {
            balance -= amnt;
            inDebt = (balance < 0);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public static void sortBalance(ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size() - 1; i++) {
            Account temp;
            for (int j = i + 1; j < accounts.size(); j++) {
                if (accounts.get(j).getBalance() > accounts.get(i).getBalance()) {
                    temp = accounts.get(i);
                    accounts.set(i, accounts.get(j));
                    accounts.set(j, temp);
                }
            }
        }
    }

    public static void sortID(ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size() - 1; i++) {
            Account temp;
            for (int j = i + 1; j < accounts.size(); j++) {
                if (accounts.get(j).getId() < accounts.get(i).getId()) {
                    temp = accounts.get(i);
                    accounts.set(i, accounts.get(j));
                    accounts.set(j, temp);
                }
            }
        }
    }

    public static void sortBy(ArrayList<Account> accounts, String choice) {
        if (choice.equals("id")||choice.equals("ID")||choice.equals("Id")||choice.equals("iD")){
            for (int i = 0; i < accounts.size() - 1; i++) {
                Account temp;
                for (int j = i + 1; j < accounts.size(); j++) {
                    if (accounts.get(j).getId() < accounts.get(i).getId()) {
                        temp = accounts.get(i);
                        accounts.set(i, accounts.get(j));
                        accounts.set(j, temp);
                    }
                }
            }
        }

    }

    public static Account searchID(ArrayList<Account> accounts, int target) {// searching for target in accounts
        Account.sortID(accounts);
        int lower = 0;
        int upper = accounts.size() - 1;

        while (lower <= upper) {
            int center = lower + (upper - lower) / 2;
            int id = accounts.get(center).getId();
            if (id == target) {
                return accounts.get(center);
            } else if (id < target) {
                lower = center + 1;
            } else {
                upper = center - 1;
            }
        }
        return null;
    }

    public String toString() {
        return "Name: " + name + "\n" + "ID: " + id + "\n" + "Pin: " + accountPin + "\n" + "Balance: " + balance;
    }

}
