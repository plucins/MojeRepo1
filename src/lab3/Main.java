package lab3;

public class Main {

    public static void main(String[] args) {
        Owner ownerAdam = new Owner("Adam", "Adamowicz");
        Owner ownerJan = new Owner("Jan", "Janowicz");
        BankAccount accountAdam = new BankAccount(ownerAdam);
        BankAccount accountJan = new BankAccount(ownerJan);


        accountAdam.showBalance();
        accountJan.showBalance();

        accountJan.deposit(100);
        accountAdam.deposit(500);

        accountJan.withdraw(50);

        accountJan.transferTo(accountAdam,400);
        accountJan.showBalance();


    }
}
