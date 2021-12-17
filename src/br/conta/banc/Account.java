
package br.conta.banc;

public abstract class Account implements IAccount{    
    protected static final int STANDARD = 1;
    private static int SEQUENCE = 1;
    
    protected int agency;
    protected int number;
    protected double balance;
    
    public Account() {
        this.agency = Account.STANDARD;
        this.number = SEQUENCE++;
    } 
    
    @Override
    public void take(double value) {
        this.balance -= balance;
    }
    @Override
    public void deposit(double value) {
        this.balance += balance;
    }
    @Override
    public void transfer(double value, Account destiny) {
        this.take(value);
        destiny.deposit(value);
    }
    
    public int getAgency() {
        return agency;
    }
    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    
    protected void impressAtribute() {
        System.out.print(String.format("\nAgencia: %d", this.agency));
        System.out.print(String.format("\nConta: %d", this.number));
        System.out.print(String.format("\nSaldo: %.2f", this.balance));
    }
}
