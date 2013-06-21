/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadews;

import javax.jws.WebService;
import javax.ejb.Stateless;
import model.ProcessResult;
import services.AdminBankPayments;

/**
 *
 * @author NicolasR
 */
@WebService(serviceName = "registerEPSBankAccount")
@Stateless()
public class RegisterEPSBankAccount {

    public ProcessResult registerEPSBankAccount(Long bankAccount, String EPSName, String password) {
       return new AdminBankPayments().registerEPSBankAccount(bankAccount, EPSName, password);
    
    }
}
