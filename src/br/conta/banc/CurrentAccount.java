
package br.conta.banc;

public class CurrentAccount extends Account {

    @Override
    public void extrat() {
        System.out.print("Extrato Conta Corrente ***");
        this.impressAtribute();
    }
}
