package lab3;

public class BankAccount {
    private double saldo;
    private Owner owner;

    public BankAccount(Owner owner) {
        this.owner = owner;
        this.saldo = 0;
    }

    public void showBalance() {
        System.out.println("Dla konta " + owner.getFullName() + " salto to: " + this.saldo);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.saldo = this.saldo + amount;
        }
    }

    public void withdraw(double amount) {
        if (saldo >= amount) {
            this.saldo = this.saldo - amount;
        }
        else {
            System.out.println("Za niskie saldo do realizacji operacji");
        }
    }

    public void transferTo(BankAccount destination, double amount) {
        if(saldo >= amount) {
            this.saldo = this.saldo - amount;
            destination.saldo = destination.saldo + amount;
        }
        else  {
            System.out.println("Za niskie saldo do realizacji");
        }
    }
}
