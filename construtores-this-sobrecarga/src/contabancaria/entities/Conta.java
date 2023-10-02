package contabancaria.entities;

public class Conta {
    private String name;
    private int numberAccount;
    private double totalInAccount;

    public Conta(String name, int numberAccount, double initialDeposity) {
        this.name = name;
        this.numberAccount = numberAccount;
        addTotalInAccount(initialDeposity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getTotalInAccount() {
        return totalInAccount;
    }

    public void addTotalInAccount(double amount) {
        this.totalInAccount += amount;
    }

    public void degreeTotalInAccount(double amount) {
        this.totalInAccount -= (amount + 5.00);
    }

    public String toString() {
        return "Hello mr. " + name + ", your account number is: " + numberAccount + " and you have a $ "
                + String.format("%.2f", totalInAccount);
    }
}
