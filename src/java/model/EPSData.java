/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/**
 *
 * @author NicolasR
 */
@Entity
public class EPSData {
    @Id
    private Long bankAccount;
    private String EPSName, password;

    public EPSData(Long bankAccount, String EPSName, String password) {
        this.bankAccount = bankAccount;
        this.EPSName = EPSName;
        this.password = password;
    }

    public Long getBankAccount() {
        return bankAccount;
    }

    public String getEPSName() {
        return EPSName;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
