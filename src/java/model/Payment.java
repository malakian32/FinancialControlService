/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Silex RPR
 */
public class Payment {

    private String idOwner, idDestination;
    private String moneyAmount, bankAccountDestination;
    
    public Payment() {
    }

    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
        this.idOwner = idOwner;
    }

    public String getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(String idDestination) {
        this.idDestination = idDestination;
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getBankAccountDestination() {
        return bankAccountDestination;
    }

    public void setBankAccountDestination(String bankAccountDestination) {
        this.bankAccountDestination = bankAccountDestination;
    }

    @Override
    public String toString() {
        return "Payment{" + "idOwner=" + idOwner + ", idDestination=" + idDestination + ", moneyAmount=" + moneyAmount + ", bankAccountDestination=" + bankAccountDestination + '}';
    }
}
