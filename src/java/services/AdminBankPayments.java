/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.bank.service.RObImpl;
import model.EPSData;
import model.Payment;
import model.ProcessResult;
import model.dao.SingleDAO;

/**
 *
 * @author NicolasR
 */
public class AdminBankPayments {

    public ProcessResult appointmentChargeTransfer(Payment payment) {

        EPSData tempEPSData = (EPSData) SingleDAO.getInstance().getEPSDAO().findAll().get(0);
        Long source = tempEPSData.getBankAccount();
        String password = tempEPSData.getPassword();

        Long destination = Long.parseLong(payment.getBankAccountDestination());

        double amount = Double.parseDouble(payment.getMoneyAmount());

        RObImpl received = this.pay(source, destination, amount, password);


        if (received.isSuccess()) {
            return ProcessResult.COMPLETED;

        } else {
            return ProcessResult.ERROR;
        }
    }

    public ProcessResult registerEPSBankAccount(Long bankAccount, String EPSName, String password) {
        EPSData epsData = new EPSData(bankAccount, EPSName, password);
        SingleDAO.getInstance().getEPSDAO().save(epsData);
        return ProcessResult.COMPLETED;
      }
    
    /*public ProcessResult updateEPSBankAccount(Long bankAccount){
        EPSData epsData = this.consultEPSBankAccount();
       
    }*/
    
    public EPSData consultEPSBankAccount() {
        return SingleDAO.getInstance().getEPSDAO().get(0);
    }
    
    
    private RObImpl pay(long source, long destination, double amount, java.lang.String passwd) {
        com.bank.service.Payment_Service service = new com.bank.service.Payment_Service();
        com.bank.service.Payment port = service.getPaymentPort();
        return port.pay(source, destination, amount, passwd);
    }
}
