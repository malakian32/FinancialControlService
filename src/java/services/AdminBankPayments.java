/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import model.Payment;
import model.ProcessResult;
import model.ROb;

/**
 *
 * @author NicolasR
 */
public class AdminBankPayments {
        
    public ProcessResult appointmentChargeTransfer(Payment payment)
    {
        //with payment Information, we use the Bank's WS for WebTransfers. Meanwhile we define a success ROb
        
        ROb received = new ROb();
        received.setData(payment);
        received.setErr_message("success");
        received.setSuccess(true);

        if (received.isSuccess()) {
            return ProcessResult.COMPLETED;

        } else {
            return ProcessResult.ERROR;
        }
    }
}
