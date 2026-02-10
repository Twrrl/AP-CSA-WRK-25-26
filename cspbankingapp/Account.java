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
        balance += amnt;
    }

    public void withdraw(double amnt) {
        if (!inDebt) {
            balance -= amnt;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getId(){
        return id;
    }

    public static void sortBalance(ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size() - 1; i++) {
            Account temp;
            for (int j = i + 1; j < accounts.size(0); j++) {
                if (accounts.get(j).getBalance() > accounts.get(i).getBalance) {
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
            for (int j = i + 1; j < accounts.size(0); j++) {
                if (accounts.get(j).getID() > accounts.get(i).getID()) {
                    temp = accounts.get(i);
                    accounts.set(i, accounts.get(j));
                    accounts.set(j, temp);
                }
            }
        }
    }

    public static Account searchID(ArrayList<Account> accounts, int target) {
        Account.sortID(accounts);
        int upper = accounts.size() - 1;
        int lower = 0;
        int center;

        while (lower < upper) {
            center = (upper - lower) / 2;
            if (accounts.get(center).getID() == target) {
                return accounts.get(center);
            }
            else if (accounts.get(center).getID() > target) {
                lower = center
                center = upper - lower;
            }
            else if (accounts.get(center).getID() < target) {
                upper = center
                center = upper - lower;
            }
        }
    }

    public String toString() {
        return String.format("ID: %d | Name: %-25s | Balance: $%,.2f | In Debt: %s",
                id, name, balance, inDebt);
    }

}
