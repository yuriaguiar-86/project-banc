
package br.conta.banc;

public class SavingsAccount extends Account {

    @Override
    public void extrat() {
        System.out.print("Extrato Conta Poupança ***");
        this.impressAtribute();
    }
}
