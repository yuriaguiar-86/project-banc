
package br.conta.banc;

public interface IAccount {
    public void take(double value);
    public void deposit(double value);
    public void transfer(double value, Account destiny);
    public void extrat();
}
