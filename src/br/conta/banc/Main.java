
package br.conta.banc;

public class Main {
    public static void main(String[] args) {
        Account cc = new CurrentAccount();
        Account cp = new SavingsAccount();
        
        cc.deposit(100);
        cc.transfer(50, cp);
        
        cc.impressAtribute();
        cp.impressAtribute();
    }
}
