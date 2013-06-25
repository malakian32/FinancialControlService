/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadews;

import javax.jws.WebService;
import javax.ejb.Stateless;
import model.EPSData;

import services.AdminBankPayments;

/**
 *
 * @author NicolasR
 */
@WebService(serviceName = "ConsultEPSBankAccount")
@Stateless()
public class ConsultEPSBankAccount {

    public EPSData consultEPSBankAccount() {
        return new AdminBankPayments().consultEPSBankAccount();


    }
}
